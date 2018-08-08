package ssjava.fibonacci;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Stas on 08.08.2018.
 */
public class FibonacciNumberGeneratorTest {

	private FibonacciNumberGenerator numberGenerator;

	@Before
	public void beforeTest() {
		numberGenerator = new FibonacciNumberGenerator();
	}

	@Test
	public void generateNumbersTest() {
		List<Long> expectedSequence = new ArrayList<>(
				Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L, 55L, 89L, 144L, 233L, 377L, 610L, 987L, 1597L, 2584L, 4181L));
		List<Long> actualSequence = new LinkedList<>();

		for (int i = 0; i < 20; i++) {
			actualSequence.add(numberGenerator.getNextNumber());
		}

		assertEquals("Actual numbers are not as expected", expectedSequence, actualSequence);
	}

}