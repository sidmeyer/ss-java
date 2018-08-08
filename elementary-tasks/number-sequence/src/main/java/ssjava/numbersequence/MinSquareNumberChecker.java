package ssjava.numbersequence;

/**
 * Created by Stas on 08.08.2018.
 */
public class MinSquareNumberChecker implements NumberChecker {

	private final long minSquare;

	public MinSquareNumberChecker(final long minSquare) {
		this.minSquare = minSquare;
	}

	@Override
	public boolean isValid(final int number) {
		return number * number >= minSquare;
	}
}
