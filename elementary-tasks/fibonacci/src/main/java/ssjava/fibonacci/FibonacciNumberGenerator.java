package ssjava.fibonacci;

/**
 * Created by Stas on 08.08.2018.
 */
public class FibonacciNumberGenerator implements NumberGenerator {

	private int beforeLastNumber = -1;
	private int lastNumber = -1;

	@Override
	public int getNextNumber() {
		if (lastNumber == -1) {
			lastNumber = 0;
			return lastNumber;
		}

		if (lastNumber == 0) {
			beforeLastNumber = lastNumber;
			lastNumber = 1;
			return lastNumber;
		}

		int newNumber = beforeLastNumber + lastNumber;
		beforeLastNumber = lastNumber;
		lastNumber = newNumber;

		return lastNumber;
	}
}
