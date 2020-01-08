package backgammon;

public class Dice {
	
	public static final int MIN = DiceSides.values()[0].getNumber();
	public static final int MAX = DiceSides.values()[5].getNumber();
	public int actualNumber; 
	
	public static void main(String[] args) {
		Dice dice = new Dice();
		System.out.println(dice.throwDice());
	}
	
	private enum DiceSides {
		SIDE_1(1), SIDE_2(2), SIDE_3(3), SIDE_4(4), SIDE_5(5), SIDE_6(6);
		
		private int number;
		
		DiceSides(int sideNumber){
			this.number = sideNumber;
		}

		public int getNumber() {
			return number;
		}
	}
	
	public Dice throwDice() {
		int randomNumber = ((int) (Math.random() * ((MAX - MIN) + 1)) + MIN) - 1;
		this.actualNumber = DiceSides.values()[randomNumber].getNumber();
		return this;
	}

}


