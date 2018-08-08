package ssjava.numbersequence;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Stas on 08.08.2018.
 */
public class MinSquareNumberCheckerTest {

	private long minSquare = 256;
	private MinSquareNumberChecker numberChecker;

	@Before
	public void beforeTest() {
		numberChecker = new MinSquareNumberChecker(minSquare);
	}

	@Test
	public void checkValidNumber() {
		int checkedNumber = 16;

		assertTrue("Number " + checkedNumber + " reported as invalid, but it is valid",
				numberChecker.isValid(checkedNumber));
	}

	@Test
	public void checkInvalidNumber() {
		int checkedNumber = 15;

		assertFalse("Number " + checkedNumber + " reported as valid, but it is invalid",
				numberChecker.isValid(checkedNumber));
	}

}