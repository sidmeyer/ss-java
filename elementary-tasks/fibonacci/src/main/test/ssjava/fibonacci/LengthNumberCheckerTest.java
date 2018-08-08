package ssjava.fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Stas on 08.08.2018.
 */
public class LengthNumberCheckerTest {

	LengthNumberChecker numberChecker;

	@Before
	public void beforeTest() {
		numberChecker = new LengthNumberChecker(3);
	}

	@Test
	public void checkValidNumber() throws Exception {
		int checkedNumber = 100;
		assertTrue("Valid number " + checkedNumber + " reported as invalid",
				numberChecker.isValid(checkedNumber));

		checkedNumber = 999;
		assertTrue("Valid number " + checkedNumber + " reported as invalid",
				numberChecker.isValid(checkedNumber));

		checkedNumber = -999;
		assertTrue("Valid number " + checkedNumber + " reported as invalid",
				numberChecker.isValid(checkedNumber));
	}

	@Test
	public void checkInvalidNumber() throws Exception {
		int checkedNumber = 99;
		assertFalse("Invalid number " + checkedNumber + " reported as valid",
				numberChecker.isValid(checkedNumber));

		checkedNumber = 1000;
		assertFalse("Invalid number " + checkedNumber + " reported as valid",
				numberChecker.isValid(checkedNumber));

		checkedNumber = -1000;
		assertFalse("Invalid number " + checkedNumber + " reported as valid",
				numberChecker.isValid(checkedNumber));
	}

}