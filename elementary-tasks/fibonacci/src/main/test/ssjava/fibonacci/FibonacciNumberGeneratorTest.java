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
		List<Integer> expectedSequence = new ArrayList<>(
				Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181));
		List<Integer> actualSequence = new LinkedList<>();

		for (int i = 0; i < 20; i++) {
			actualSequence.add(numberGenerator.getNextNumber());
		}

		assertEquals("Actual numbers are not as expected", expectedSequence, actualSequence);
	}

}