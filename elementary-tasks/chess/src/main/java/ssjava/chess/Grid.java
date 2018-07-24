package ssjava.chess;

/**
 * Created by Stas on 24.07.2018.
 */
public class Grid {

	private final int xSize;
	private final int ySize;

	private final Square[] squares;

	public Grid(final int xSize, final int ySize) {
		this.xSize = xSize;
		this.ySize = ySize;
		squares = new Square[xSize * ySize];
		fillField();
	}

	public void printGrid() {
		for (int i = 0; i < squares.length; i++) {
			System.out.print(squares[i].getColor());
			if (i % xSize == (xSize - 1)) {
				System.out.println();
			}
		}
	}

	public Square getSquare(final int x, final int y) {
		return squares[getIndexByCoordinates(x, y)];
	}

	private int getIndexByCoordinates(final int x, final int y) {
		return xSize * y + x;
	}

	private void fillField() {
		for (int i = 0; i < squares.length; i++) {
			squares[i] = new Square(getColorByIndex(i));
		}
	}

	private Color getColorByIndex(int index) {
		if ((index / xSize) % 2 == 0) {
			return index % 2 == 0 ? Color.WHITE : Color.BLACK;
		} else {
			return index % 2 == 0 ? Color.BLACK : Color.WHITE;
		}
	}

	public int getxSize() {
		return xSize;
	}

	public int getySize() {
		return ySize;
	}
}
