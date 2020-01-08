package backgammon;

public class Chip {
	private int position;
	private Color color;

	public Chip(Color color) {
		super();
		this.color = color;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
