import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

//MID EXAM OOP
//Nama : Vincent Hadinata
//NIM: 2301850430
//Kelas : LA01

public class Main {

	Scanner scan= new Scanner(System.in);
	Random rand= new Random();
	
	Player player1 = new PlayerA(null,0,0,0);
	Player player2 = new PlayerB(null,0,0,0);
	Player player3 = new PlayerC(null,0,0,0);
	
	Vector<PlayerA> reportsA = new Vector<>();
	Vector<PlayerA> reportsB = new Vector<>();
	Vector<PlayerA> reportsC = new Vector<>();
	
	
	int dice=0;
	int old=0;
	int step=0;
	
	void clear(){
		
		for (int i = 0; i < 20; i++) {
			System.out.println("");
		}
	}
	
	private void reportsTwo(){
		
		clear();
		System.out.println("Reports");
		System.out.println("============================================");
		for (int i = 0; i < reportsA.size(); i++) {
			System.out.println("Round "+ (i+1));
			System.out.println(player1.getName()+" -> Old: "+ reportsA.get(i).getOld() +", Dice: "+ reportsA.get(i).getDice() +", New: "+ reportsA.get(i).getStep());
			System.out.println(player2.getName()+" -> Old: "+ reportsB.get(i).getOld() +", Dice: "+ reportsB.get(i).getDice() +", New: "+ reportsB.get(i).getStep());
			System.out.println("");
		}
		
		System.out.print("Press enter to continue...");
		scan.nextLine();
	}
	
	private void reportsThree(){
		
		clear();
		System.out.println("Reports");
		System.out.println("============================================");
		for (int i = 0; i < reportsA.size(); i++) {
			System.out.println("Round "+ (i+1));
			System.out.println(player1.getName()+" -> Old: "+ reportsA.get(i).getOld() +", Dice: "+ reportsA.get(i).getDice() +", New: "+ reportsA.get(i).getStep());
			System.out.println(player2.getName()+" -> Old: "+ reportsB.get(i).getOld() +", Dice: "+ reportsB.get(i).getDice() +", New: "+ reportsB.get(i).getStep());
			System.out.println(player3.getName()+" -> Old: "+ reportsC.get(i).getOld() +", Dice: "+ reportsC.get(i).getDice() +", New: "+ reportsC.get(i).getStep());
			System.out.println("");
		}
		
		System.out.print("Press enter to continue...");
		scan.nextLine();
	}
	
	private void playerTurnC(){
		
		System.out.print(player3.getName()+" Turn, Press enter to roll dice");
		scan.nextLine();
		
		dice = rand.nextInt(6)+1;
		System.out.println("Your dice throw is " + dice);
		
		old= ((PlayerC)player3).getStep();
		step = ((PlayerC)player3).getStep() +dice;
		
		if(step == 13 || step== 50 || step==95){;
			System.out.print("Oops, you got the penalty, ");
			
			if(step==13)step=7;
			else if(step==50)step=38;
			else if(step==95)step=76;
		}
		else if(step==25 || step ==63 || step==83){
			System.out.print("Yeay, you got the bonus step, ");
			
			if(step==25)step=40;
			else if(step==63)step=78;
			else if(step==83)step=97;
		}
		else if(step>100){
			System.out.print("You've excedeed the maximum step, ");
			
			step= 100 - (step-100);
		}
		
		((PlayerC)player3).setStep(step);
		((PlayerC)player3).setOld(old);
		((PlayerC)player3).setDice(dice);
		reportsC.add(new PlayerA(player3.getName(),step,dice,old));
		
		System.out.print("Your step now is "+ step);
		scan.nextLine();
		
	}
	
	private void playerTurnB(){
		
		System.out.print(player2.getName()+" Turn, Press enter to roll dice");
		scan.nextLine();
		
		dice = rand.nextInt(6)+1;
		System.out.println("Your dice throw is " + dice);
		
		old= ((PlayerB)player2).getStep();
		step = ((PlayerB)player2).getStep() +dice;
		
		if(step == 13 || step== 50 || step==95){;
			System.out.print("Oops, you got the penalty, ");
			
			if(step==13)step=7;
			else if(step==50)step=38;
			else if(step==95)step=76;
		}
		else if(step==25 || step ==63 || step==83){
			System.out.print("Yeay, you got the bonus step, ");
			
			if(step==25)step=40;
			else if(step==63)step=78;
			else if(step==83)step=97;
		}
		else if(step>100){
			System.out.print("You've excedeed the maximum step, ");
			
			step= 100 - (step-100);
		}
		
		((PlayerB)player2).setStep(step);
		((PlayerB)player2).setOld(old);
		((PlayerB)player2).setDice(dice);
		reportsB.add(new PlayerA(player2.getName(),step,dice,old));
		
		System.out.print("Your step now is "+ step);
		scan.nextLine();
		
	}
	
	private void playerTurnA(){
		
		System.out.print(player1.getName()+" Turn, Press enter to roll dice");
		scan.nextLine();
		
		dice = rand.nextInt(6)+1;
		System.out.println("Your dice throw is " + dice);
		
		old= ((PlayerA)player1).getStep();
		step = ((PlayerA)player1).getStep() +dice;
		
		if(step == 13 || step== 50 || step==95){;
			System.out.print("Oops, you got the penalty, ");
			
			if(step==13)step=7;
			else if(step==50)step=38;
			else if(step==95)step=76;
		}
		else if(step==25 || step ==63 || step==83){
			System.out.print("Yeay, you got the bonus step, ");
			
			if(step==25)step=40;
			else if(step==63)step=78;
			else if(step==83)step=97;
		}
		else if(step>100){
			System.out.print("You've excedeed the maximum step, ");
			
			step= 100 - (step-100);
		}
		
		((PlayerA)player1).setStep(step);
		((PlayerA)player1).setOld(old);
		((PlayerA)player1).setDice(dice);
		reportsA.add(new PlayerA(player1.getName(),step,dice,old));
		
		System.out.print("Your step now is "+ step);
		scan.nextLine();
		
		
	}
	
	private void playTwoPlayer(){
		
		
		for (int i = 0; i < 25; i++) {
			
			clear();
			playerTurnA();
			
			if(reportsA.get(reportsA.size()-1).getStep()==100){
				reportsB.add(new PlayerA(null,reportsB.get(reportsB.size()-1).getStep(),0,0));
				break;
			}
			clear();
			playerTurnB();
			
			if(reportsB.get(reportsB.size()-1).getStep()==100){
				break;
			}
			reportsTwo();
		}
		
		clear();
		System.out.println("Leaderboard");
		System.out.println("==========================");
		
		if(reportsA.get(reportsA.size()-1).getStep()>reportsB.get(reportsB.size()-1).getStep()){
			System.out.println("#1. " +player1.getName()+" -> Step: "+reportsA.get(reportsA.size()-1).getStep());
			System.out.println("#2. " +player2.getName()+" -> Step: "+reportsB.get(reportsB.size()-1).getStep());
		}
		
		else if(reportsA.get(reportsA.size()-1).getStep()<reportsB.get(reportsB.size()-1).getStep()){
			
			System.out.println("#1. " +player2.getName()+" -> Step: "+reportsB.get(reportsB.size()-1).getStep());
			System.out.println("#2. " +player1.getName()+" -> Step: "+reportsA.get(reportsA.size()-1).getStep());
		}
		
		else{
			System.out.println("#1. " +player1.getName()+" -> Step: "+reportsA.get(reportsA.size()-1).getStep());
			System.out.println("#1. " +player2.getName()+" -> Step: "+reportsB.get(reportsB.size()-1).getStep());
		}
		
		System.out.println("");
		System.out.print("Press enter to continue...");
		scan.nextLine();
		
		
	}
	
	private void playThreePlayer(){
		
		
		for (int i = 0; i < 25; i++) {
			
			clear();
			playerTurnA();
			if(reportsA.get(reportsA.size()-1).getStep()==100){
				reportsB.add(new PlayerA(null,reportsB.get(reportsB.size()-1).getStep(),0,0));
				reportsC.add(new PlayerA(null,reportsC.get(reportsC.size()-1).getStep(),0,0));
				break;
			}
			
			clear();
			playerTurnB();
			if(reportsB.get(reportsB.size()-1).getStep()==100){
				reportsC.add(new PlayerA(null,reportsC.get(reportsC.size()-1).getStep(),0,0));
				break;
			}
			
			clear();
			playerTurnC();
			if(reportsC.get(reportsC.size()-1).getStep()==100){
				break;
			}
			
			reportsThree();
		}
		
		clear();
		System.out.println("Leaderboard");
		System.out.println("==========================");
		
		
//		A>B & A>C
		if(reportsA.get(reportsA.size()-1).getStep()>reportsB.get(reportsB.size()-1).getStep() && 
				reportsA.get(reportsA.size()-1).getStep()>reportsC.get(reportsC.size()-1).getStep()){
			
			System.out.println("#1. " +player1.getName()+" -> Step: "+reportsA.get(reportsA.size()-1).getStep());
			
//			B>C
			if(reportsB.get(reportsB.size()-1).getStep()>reportsC.get(reportsC.size()-1).getStep()){
				System.out.println("#2. " +player2.getName()+" -> Step: "+reportsB.get(reportsB.size()-1).getStep());
				System.out.println("#3. " +player3.getName()+" -> Step: "+reportsC.get(reportsC.size()-1).getStep());
			}
//			C>B
			else if(reportsB.get(reportsB.size()-1).getStep()< reportsC.get(reportsC.size()-1).getStep()){
				System.out.println("#2. " +player3.getName()+" -> Step: "+reportsC.get(reportsC.size()-1).getStep());
				System.out.println("#3. " +player2.getName()+" -> Step: "+reportsB.get(reportsB.size()-1).getStep());
			}
//			C=B
			else{
				System.out.println("#2. " +player2.getName()+" -> Step: "+reportsB.get(reportsB.size()-1).getStep());
				System.out.println("#2. " +player3.getName()+" -> Step: "+reportsC.get(reportsC.size()-1).getStep());
			}
			
		}
		
//		B>A & B>C
		else if(reportsA.get(reportsA.size()-1).getStep()<reportsB.get(reportsB.size()-1).getStep() && 
				reportsB.get(reportsB.size()-1).getStep()>reportsC.get(reportsC.size()-1).getStep()){
			
			System.out.println("#1. " +player2.getName()+" -> Step: "+reportsB.get(reportsB.size()-1).getStep());
			
//			A>C
			if(reportsA.get(reportsA.size()-1).getStep()>reportsC.get(reportsC.size()-1).getStep()){
				System.out.println("#2. " +player1.getName()+" -> Step: "+reportsA.get(reportsA.size()-1).getStep());
				System.out.println("#3. " +player3.getName()+" -> Step: "+reportsC.get(reportsC.size()-1).getStep());
			}
//			A<C
			else if(reportsA.get(reportsA.size()-1).getStep()< reportsC.get(reportsC.size()-1).getStep()){
				System.out.println("#2. " +player3.getName()+" -> Step: "+reportsC.get(reportsC.size()-1).getStep());
				System.out.println("#3. " +player1.getName()+" -> Step: "+reportsA.get(reportsA.size()-1).getStep());
			}
//			A=C
			else{
				System.out.println("#2. " +player1.getName()+" -> Step: "+reportsA.get(reportsA.size()-1).getStep());
				System.out.println("#2. " +player3.getName()+" -> Step: "+reportsC.get(reportsC.size()-1).getStep());
			}
			
		}
		
//		C>A & C>B
		else if(reportsC.get(reportsC.size()-1).getStep()>reportsB.get(reportsB.size()-1).getStep() && 
				reportsA.get(reportsA.size()-1).getStep()<reportsC.get(reportsC.size()-1).getStep()){
			
			System.out.println("#1. " +player3.getName()+" -> Step: "+reportsC.get(reportsC.size()-1).getStep());
			
//			A>B
			if(reportsA.get(reportsA.size()-1).getStep()>reportsB.get(reportsB.size()-1).getStep()){
				System.out.println("#2. " +player1.getName()+" -> Step: "+reportsA.get(reportsA.size()-1).getStep());
				System.out.println("#3. " +player2.getName()+" -> Step: "+reportsB.get(reportsB.size()-1).getStep());
			}
//			A<B
			else if(reportsB.get(reportsC.size()-1).getStep()> reportsA.get(reportsA.size()-1).getStep()){
				System.out.println("#2. " +player2.getName()+"-> Step: "+reportsB.get(reportsB.size()-1).getStep());
				System.out.println("#3. " +player1.getName()+" -> Step: "+reportsA.get(reportsA.size()-1).getStep());
			}
//			C=B
			else{
				System.out.println("#2. " +player1.getName()+" -> Step: "+reportsA.get(reportsA.size()-1).getStep());
				System.out.println("#2. " +player2.getName()+" -> Step: "+reportsB.get(reportsB.size()-1).getStep());
			}
			
		}
		
//		A=B & A>C
		else if(reportsA.get(reportsA.size()-1).getStep()==reportsB.get(reportsB.size()-1).getStep() && 
				reportsA.get(reportsA.size()-1).getStep()>reportsC.get(reportsC.size()-1).getStep()){
			
			System.out.println("#1. " +player1.getName()+" -> Step: "+reportsA.get(reportsA.size()-1).getStep());
			System.out.println("#1. " +player2.getName()+" -> Step: "+reportsB.get(reportsB.size()-1).getStep());
			System.out.println("#2. " +player3.getName()+" -> Step: "+reportsC.get(reportsC.size()-1).getStep());
						
		}
		
//		A=C & A>B
		else if(reportsA.get(reportsA.size()-1).getStep()>reportsB.get(reportsB.size()-1).getStep() && 
				reportsA.get(reportsA.size()-1).getStep()==reportsC.get(reportsC.size()-1).getStep()){
			
			System.out.println("#1. " +player1.getName()+" -> Step: "+reportsA.get(reportsA.size()-1).getStep());
			System.out.println("#1. " +player3.getName()+" -> Step: "+reportsC.get(reportsC.size()-1).getStep());
			System.out.println("#2. " +player2.getName()+" -> Step: "+reportsB.get(reportsB.size()-1).getStep());
						
		}
		
//		B=C & B>A
		else if(reportsA.get(reportsA.size()-1).getStep()<reportsB.get(reportsB.size()-1).getStep() && 
				reportsB.get(reportsB.size()-1).getStep()==reportsC.get(reportsC.size()-1).getStep()){
			
			System.out.println("#1. " +player2.getName()+" -> Step: "+reportsB.get(reportsB.size()-1).getStep());
			System.out.println("#1. " +player3.getName()+" -> Step: "+reportsC.get(reportsC.size()-1).getStep());
			System.out.println("#2. " +player1.getName()+" -> Step: "+reportsA.get(reportsA.size()-1).getStep());
						
		}
		
//		A=B=C
		else if(reportsA.get(reportsA.size()-1).getStep()==reportsB.get(reportsB.size()-1).getStep() && 
				reportsB.get(reportsB.size()-1).getStep()==reportsC.get(reportsC.size()-1).getStep()){
			
			System.out.println("#1. " +player1.getName()+" -> Step: "+reportsA.get(reportsA.size()-1).getStep());
			System.out.println("#1. " +player2.getName()+" -> Step: "+reportsB.get(reportsB.size()-1).getStep());
			System.out.println("#1. " +player3.getName()+" -> Step: "+reportsC.get(reportsC.size()-1).getStep());
						
		}
		
		System.out.println("");
		System.out.print("Press enter to continue...");
		scan.nextLine();
	}
	
	public Main() {
		
		String name;
		int menu=-1,flag=0;
		do {
			clear();
			System.out.println("Snake Ladders Game");
			System.out.println("Vincent Hadinata | 2301850430 | LA01");
			System.out.println("======================================");
			System.out.println("1. 2 players");
			System.out.println("2. 3 players");
			System.out.println("3. Exit");
			System.out.print("Choose >> ");
			
			try {
				menu = scan.nextInt();				
				if(menu<1 || menu >3){
					System.err.print("Input must between 1-3");
					scan.nextLine();
				}
			} catch (Exception e) {
				System.err.print("Input must be number!!");
				scan.nextLine();
			}
			
			scan.nextLine();
			
			switch (menu) {
			case 1:
				
				do{
					System.out.print("Input Player A Name [5-20 characters]: ");
					name = scan.nextLine();
					
				}while(name.length()<5 || name.length()>20);
				
				player1.setName(name);
				
				do{
					flag=0;
					System.out.print("Input Player B Name [5-20 characters]: ");
					name = scan.nextLine();
					
					if(name.equals(player1.getName())){
						flag=1;
						System.err.print("Name cannot be same as player 1!!");
						scan.nextLine();
					}
					
				}while(name.length()<5 || name.length()>20 ||flag==1);
				
				player2.setName(name);
				
				playTwoPlayer();
				reportsA.clear();
				reportsB.clear();
				((PlayerA)player1).setOld(0);
				((PlayerA)player1).setStep(0);
				((PlayerB)player2).setOld(0);
				((PlayerB)player2).setStep(0);
				
				break;

			case 2:
				
				do{
					System.out.print("Input Player A Name [5-20 characters]: ");
					name = scan.nextLine();
					
					
				}while(name.length()<5 || name.length()>20);
				
				player1.setName(name);
				
				do{
					flag=0;
					System.out.print("Input Player B Name [5-20 characters]: ");
					name = scan.nextLine();
					
					if(name.equals(player1.getName())){
						flag=1;
						System.err.print("Name cannot be same as player 1!!");
						scan.nextLine();
					}
					
				}while(name.length()<5 || name.length()>20 || flag==1);
				
				player2.setName(name);
				
				do{
					flag=0;
					System.out.print("Input Player C Name [5-20 characters]: ");
					name = scan.nextLine();
					
					if(name.equals(player1.getName()) || name.equals(player2.getName())){
						flag=1;
						System.err.print("Name cannot be same as player 1 or player 2!!");
						scan.nextLine();
					}
					
				}while(name.length()<5 || name.length()>20 || flag==1);
				
				player3.setName(name);
				
				playThreePlayer();
				reportsA.clear();
				reportsB.clear();
				reportsC.clear();
				((PlayerA)player1).setOld(0);
				((PlayerA)player1).setStep(0);
				((PlayerB)player2).setOld(0);
				((PlayerB)player2).setStep(0);
				((PlayerC)player3).setOld(0);
				((PlayerC)player3).setStep(0);
				break;
			}
			
		} while (menu!=3);
		
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
