package backgammon;

import java.util.ArrayList;

public class Table {
	private ArrayList<Chip>[] positions;
	private final int NUMBER_OF_POSITIONS = 24;
	private final int NUMBER_OF_CHIPS = 14;
	private final int NUMBER_OF_DICES = 2;
	private ArrayList<Chip> blackChips;
	private ArrayList<Chip> whiteChips;

	public Table() {
		super();
		this.blackChips = new ArrayList<Chip>(NUMBER_OF_CHIPS);
		this.whiteChips = new ArrayList<Chip>(NUMBER_OF_CHIPS);
		this.createAllChips();
	}

	private void createAllChips() {
		Chip blackChip = new Chip(Color.BLACK);
		Chip whiteChip = new Chip(Color.WHITE);
		
		for (int i = 0; i < NUMBER_OF_CHIPS; i++) {
			this.blackChips.add(blackChip);
			this.whiteChips.add(whiteChip);
		}
	}
	
	private void createTable() {
		for (int i = 0; i < NUMBER_OF_POSITIONS; i++) {
			positions[i] = new ArrayList<Chip>();
		}
	}
	
	public Dice[] throwDices() {
		Dice[]dices = new Dice[NUMBER_OF_DICES];
		dices[0] = new Dice().throwDice();
		dices[1] = new Dice().throwDice();
		return dices;
	}
	
	private void setupChips() {
		
		/*
								 +12-13-14-15-16-17------18-19-20-21-22-23-+     O
								 | X           O    |   | O              X |
								 | X           O    |   | O              X |
								 | X           O    |   | O                |
								 | X                |   | O                |
								 | X                |   | O                |
								v|                  |BAR|                  |   
								 | O                |   | X                |
								 | O                |   | X                |
								 | O           X    |   | X                |
								 | O           X    |   | X              O |
								 | O           X    |   | X              O |     
								 +11-10-9--8--7--6-------5--4--3--2--1--0--+     X
		 */
		
		createTable();
		createAllChips();
		
		for (int i = 0; i < 5 ; i++) {			 
			if (i <= 2) {
				positions[0].add(whiteChips.remove(whiteChips.size()-1));
				positions[23].add(blackChips.remove(blackChips.size()-1));
			}
			
			if(i <= 3) {
				positions[5].add(whiteChips.remove(whiteChips.size()-1));
				positions[11].add(blackChips.remove(blackChips.size()-1));
			}
				
			positions[5].add(whiteChips.remove(whiteChips.size()-1));
			positions[12].add(whiteChips.remove(whiteChips.size()-1));
			positions[11].add(blackChips.remove(blackChips.size()-1));
			positions[18].add(blackChips.remove(blackChips.size()-1));
	
		}
	}

	public ArrayList<Chip>[] getPositions() {
		return positions;
	}

	public void setPositions(ArrayList<Chip>[] positions) {
		this.positions = positions;
	}
}
