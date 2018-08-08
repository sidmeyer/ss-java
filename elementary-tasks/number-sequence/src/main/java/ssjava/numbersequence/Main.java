package ssjava.numbersequence;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Stas on 25.07.2018.
 */
public class Main {

    public static void main(String[] args) {
        final int length;
        final long minSquare;

        try {
            length = Integer.parseInt(args[0]);
            minSquare = Long.parseLong(args[1]);
        } catch (Exception e) {
            System.out.println("Cannot parse input params.");
            printHelp();
            return;
        }

        List<Integer> sequence = new LinkedList<>();

        NumberGenerator numberGenerator = new NaturalNumberGenerator();
        NumberChecker numberChecker = new MinSquareNumberChecker(minSquare);

        while (sequence.size() < length) {
            int currentNumber = numberGenerator.getNextNumber();
            if (numberChecker.isValid(currentNumber)) {
                sequence.add(currentNumber);
            }
        }

        SequenceFormatter sequenceFormatter = new CommaSeparatedSequenceFormatter();

        System.out.println(sequenceFormatter.formatSequence(sequence));
    }

    private static void printHelp() {
        System.out.println("Выводит через запятую ряд длиной n, состоящий из натуральных чисел, квадрат которых не меньше заданного m.\n" +
                "Входные параметры: длина и значение минимального квадрата.\n" +
                "Выход: строка с рядом чисел.\n" +
                "Example:\n" +
                "java ssjava.numbersequence.Main 8 10");
    }

//    public static void main(String[] args) {
//        final int length;
//        final long minSquare;
//
//        try {
//            length = Integer.parseInt(args[0]);
//            minSquare = Long.parseLong(args[1]);
//        } catch (Exception e) {
//            System.out.println("Cannot parse input params.");
//            printHelp();
//            return;
//        }
//
//        String sequenceString = IntStream.iterate(0, i -> i + 1)
//                .filter(n -> n * n >= minSquare)
//                .limit(length)
//                .mapToObj(Integer::toString)
//                .collect(Collectors.joining(","));
//
//        System.out.println(sequenceString);
//    }
}
