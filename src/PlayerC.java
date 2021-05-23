
public class PlayerC extends Player{
	
	private int step;
	private int dice;
	private int old;
	
	
	public int getStep() {
		return step;
	}
	
	public PlayerC(String name,int step, int dice, int old) {
		super(name);
		this.step = step;
		this.dice = dice;
		this.old = old;
	}
	
	public void setStep(int step) {
		this.step = step;
	}
	public int getDice() {
		return dice;
	}
	public void setDice(int dice) {
		this.dice = dice;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	
}
