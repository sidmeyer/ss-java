package ssjava.fibonacci;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Stas on 08.08.2018.
 */
public class Main {
	public static void main(String[] args) {

		final NumberChecker numberChecker;

		try {
			if (args.length == 1) {
				int length = Integer.parseInt(args[0]);
				numberChecker = new LengthNumberChecker(length);
			} else if (args.length ==2) {
				int rangeStart = Integer.parseInt(args[0]);
				int rangeFinish = Integer.parseInt(args[1]);
				numberChecker = new RangeNumberChecker(rangeStart, rangeFinish);
			} else {
				throw new IllegalArgumentException("Invalid number of arguments.");
			}
		} catch (Exception e) {
			System.out.println("Cannot parse input params.");
			System.out.println(e.getMessage());
			printHelp();
			return;
		}

		NumberGenerator numberGenerator = new FibonacciNumberGenerator();
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

		System.out.println(numbers);
	}

	private static void printHelp() {
		System.out.println("Выводит все числа Фибоначчи, которые удовлетворяют переданному в функцию ограничению: " +
				"находятся в указанном диапазоне, либо имеют указанную длину.\n" +
				"Examples:\n" +
				"java ssjava.fibonacci.Main 3\n" +
				"java ssjava.fibonacci.Main 10 100");
	}
}
