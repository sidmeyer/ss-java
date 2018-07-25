package ssjava.numbersequence;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Stas on 25.07.2018.
 */
public class Main {

    public static void main(String[] args) {
        final int length;
        final int minSquare;

        try {
            length = Integer.parseInt(args[0]);
            minSquare = Integer.parseInt(args[1]);
        } catch (Exception e) {
            System.out.println("Cannot parse input params.");
            printHelp();
            return;
        }

        String sequenceString = IntStream.rangeClosed(1, length)
                .filter(n -> n * n >= minSquare)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(","));

        System.out.println(sequenceString);
    }

    private static void printHelp() {
        System.out.println("Выводит через запятую ряд длиной n, состоящий из натуральных чисел, квадрат которых не меньше заданного m.\n" +
                "Входные параметры: длина и значение минимального квадрата.\n" +
                "Выход: строка с рядом чисел.\n" +
                "Example:\n" +
                "java ssjava.numbersequence.Main 8 10");
    }
}
