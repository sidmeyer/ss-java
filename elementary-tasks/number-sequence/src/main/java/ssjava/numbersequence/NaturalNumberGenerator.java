package ssjava.numbersequence;

/**
 * Created by Stas on 08.08.2018.
 */
public class NaturalNumberGenerator implements NumberGenerator {

	private int currentNumber = 1;

	@Override
	public int getNextNumber() {
		return currentNumber++;
	}
}
