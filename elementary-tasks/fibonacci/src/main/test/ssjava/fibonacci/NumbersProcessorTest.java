package ssjava.fibonacci;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NumbersProcessorTest {

    @Test
    public void checkSequenceWithLengthRestriction() {
        NumberGenerator numberGenerator = new FibonacciNumberGenerator();
        NumberChecker numberChecker = new LengthNumberChecker(3);
        NumbersProcessor processor = new NumbersProcessor(numberGenerator, numberChecker);

        List<Long> expected = new ArrayList<>(Arrays.asList(144L, 233L, 377L, 610L, 987L));
        List<Long> actual = processor.getNumbers();

        assertEquals("Actual sequence is not as expected", expected, actual);
    }

    @Test
    public void checkSequenceWithRangeRestriction() {
        NumberGenerator numberGenerator = new FibonacciNumberGenerator();
        NumberChecker numberChecker = new RangeNumberChecker(10, 150);
        NumbersProcessor processor = new NumbersProcessor(numberGenerator, numberChecker);

        List<Long> expected = new ArrayList<>(Arrays.asList(13L, 21L, 34L, 55L, 89L, 144L));
        List<Long> actual = processor.getNumbers();

        assertEquals("Actual sequence is not as expected", expected, actual);
    }

}