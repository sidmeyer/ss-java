package ssjava.fibonacci;

/**
 * Created by Stas on 08.08.2018.
 */
public class RangeNumberChecker implements NumberChecker {

	private final long start;
	private final long finish;

	public RangeNumberChecker(final long start, final long finish) {

		if (start > finish) {
			throw new IllegalArgumentException("Range start cannot be greater then finish.");
		}

		this.start = start;
		this.finish = finish;
	}

	@Override
	public boolean isValid(final long number) {
		return number >= start && number <= finish;
	}
}
