package ssjava.fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Stas on 08.08.2018.
 */
public class RangeNumberCheckerTest {

	RangeNumberChecker numberChecker;

	@Before
	public void beforeTest() {
		numberChecker = new RangeNumberChecker(10, 100);
	}

	@Test
	public void checkValidNumber() throws Exception {
		int checkedNumber = 10;
		assertTrue("Valid number " + checkedNumber + " reported as invalid",
				numberChecker.isValid(checkedNumber));

		checkedNumber = 100;
		assertTrue("Valid number " + checkedNumber + " reported as invalid",
				numberChecker.isValid(checkedNumber));

		checkedNumber = 50;
		assertTrue("Valid number " + checkedNumber + " reported as invalid",
				numberChecker.isValid(checkedNumber));
	}

	@Test
	public void checkInvalidNumber() throws Exception {
		int checkedNumber = 9;
		assertFalse("Invalid number " + checkedNumber + " reported as valid",
				numberChecker.isValid(checkedNumber));

		checkedNumber = 101;
		assertFalse("Invalid number " + checkedNumber + " reported as valid",
				numberChecker.isValid(checkedNumber));

		checkedNumber = -50;
		assertFalse("Invalid number " + checkedNumber + " reported as valid",
				numberChecker.isValid(checkedNumber));
	}

}