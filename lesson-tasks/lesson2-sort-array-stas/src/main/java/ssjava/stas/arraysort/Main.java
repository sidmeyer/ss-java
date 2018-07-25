package ssjava.stas.arraysort;

import java.util.*;

public class Main {
    private static final int[] ARRAY = {12, 76, 45, 1, 9, 87, 32, 10};

    public static void main(String[] args) {

        List<Integer> simpleSortedList = new LinkedList<>();
        for (int n : ARRAY) {
            simpleSortedList.add(n);
        }

        Collections.sort(simpleSortedList);

        LinkedList<Integer> sortedList = new LinkedList<>();

        for (int i = 0; i < simpleSortedList.size(); i++) {
            if (i % 2 == 0) {
                sortedList.addLast(simpleSortedList.get(i));
            } else {
                sortedList.addFirst(simpleSortedList.get(i));
            }
        }

        System.out.println(sortedList);
    }
}
