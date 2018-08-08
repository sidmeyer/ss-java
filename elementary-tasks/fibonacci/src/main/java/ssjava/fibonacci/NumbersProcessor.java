package ssjava.fibonacci;

import java.util.LinkedList;
import java.util.List;

public class NumbersProcessor {

    private final NumberGenerator numberGenerator;
    private final NumberChecker numberChecker;

    public NumbersProcessor(NumberGenerator numberGenerator, NumberChecker numberChecker) {
        this.numberGenerator = numberGenerator;
        this.numberChecker = numberChecker;
    }

    public List<Long> getNumbers() {
        List<Long> numbers = new LinkedList<>();

        boolean firstNumberFounded = false;
        boolean lastNumberFounded = false;

        while (!(firstNumberFounded && lastNumberFounded)) {
            long currentNumber = numberGenerator.getNextNumber();
            if (numberChecker.isValid(currentNumber)) {
                firstNumberFounded = true;
                numbers.add(currentNumber);
            } else if (firstNumberFounded) {
                lastNumberFounded = true;
            }
        }

        return numbers;
    }

}
