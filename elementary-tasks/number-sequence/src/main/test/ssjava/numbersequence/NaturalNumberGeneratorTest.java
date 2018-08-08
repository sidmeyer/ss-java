package ssjava.numbersequence;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Stas on 08.08.2018.
 */
public class NaturalNumberGeneratorTest {

	NaturalNumberGenerator numberGenerator;

	@Before
	public void beforeTest() {
		numberGenerator = new NaturalNumberGenerator();
	}

	@Test
	public void numberGenerationTest() {
		int expected = 1;
		int actual = numberGenerator.getNextNumber();

		assertEquals("Actual number is not as expected", expected, actual);

		expected = 2;
		actual = numberGenerator.getNextNumber();

		assertEquals("Actual number is not as expected", expected, actual);

		expected = 3;
		actual = numberGenerator.getNextNumber();

		assertEquals("Actual number is not as expected", expected, actual);
		expected = 4;
		actual = numberGenerator.getNextNumber();

		assertEquals("Actual number is not as expected", expected, actual);

	}
}
