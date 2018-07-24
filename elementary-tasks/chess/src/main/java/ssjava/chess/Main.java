package ssjava.chess;

/**
 * Created by Stas on 24.07.2018.
 */
public class Main {

	public static void main(String[] args) {
		// TODO handle args
		// TODO validation
		Grid grid = new Grid(8, 8);
		Board board = new Board(grid);

		grid.printGrid();
	}

}
