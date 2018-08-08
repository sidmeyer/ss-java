package ssjava.fibonacci;

/**
 * Created by Stas on 08.08.2018.
 */
public class RangeNumberChecker implements NumberChecker {

	private final int start;
	private final int finish;

	public RangeNumberChecker(final int start, final int finish) {

		if (start > finish) {
			throw new IllegalArgumentException("Range start cannot be greater then finish.");
		}

		this.start = start;
		this.finish = finish;
	}

	@Override
	public boolean isValid(final int number) {
		return number >= start && number <= finish;
	}
}
