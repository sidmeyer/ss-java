package ssjava.chess;

/**
 * Created by Stas on 24.07.2018.
 */
public class Main {

	public static void main(String[] args) {

		final int width;
		final int heigth;

		try {
			width = Integer.parseInt(args[0]);
			heigth = Integer.parseInt(args[1]);
			if (width < 1 || heigth < 1) {
				throw new IllegalArgumentException();
			}
		} catch (Exception e) {
			System.out.println("Cannot parse input params.");
			printHelp();
			return;
		}

		Grid grid = new Grid(width, heigth);
		Board board = new Board(grid);

		grid.printGrid();
	}

	private static void printHelp() {
		System.out.println("Вывеодит шахматную доску с заданными шириной и высотой.\n" +
				"Example:\n" +
				"java ssjava.chess.Main 8 8");
	}

}
