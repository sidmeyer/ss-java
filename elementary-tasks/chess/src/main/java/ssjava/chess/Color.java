package ssjava.chess;

/**
 * Created by Stas on 25.07.2018.
 */
public enum Color {
	BLACK("*"),
	WHITE(" ");

	private String symbol;

	Color(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}
}