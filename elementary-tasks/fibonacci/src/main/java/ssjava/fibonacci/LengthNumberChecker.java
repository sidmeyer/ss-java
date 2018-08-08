package ssjava.fibonacci;

/**
 * Created by Stas on 08.08.2018.
 */
public class LengthNumberChecker implements NumberChecker {

	private final int length;

	public LengthNumberChecker(final int length) {

		if (length < 1) {
			throw new IllegalArgumentException("Length must be greater then 0.");
		}

		this.length = length;
	}

	@Override
	public boolean isValid(int number) {
		String digitsString = String.valueOf(number).replace("-", "");
		return digitsString.length() == length;
	}
}
