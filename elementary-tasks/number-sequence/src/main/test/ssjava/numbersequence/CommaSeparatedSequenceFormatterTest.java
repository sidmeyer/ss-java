package ssjava.numbersequence;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Stas on 08.08.2018.
 */
public class CommaSeparatedSequenceFormatterTest {

	private CommaSeparatedSequenceFormatter sequenceFormatter;

	@Before
	public void beforeTest() {
		sequenceFormatter = new CommaSeparatedSequenceFormatter();
	}

	@Test
	public void integerListFormatTest() {
		List<Integer> inputSequence = new ArrayList<>(Arrays.asList(3, 6, 32, -6, 0, 100500));
		String expected = "3,6,32,-6,0,100500";
		String actual = sequenceFormatter.formatSequence(inputSequence);

		assertEquals("Actual result is not as expected", expected, actual);
	}

}
