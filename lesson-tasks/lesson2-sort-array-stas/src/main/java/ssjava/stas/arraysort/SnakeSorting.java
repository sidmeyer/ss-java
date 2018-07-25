package ssjava.stas.arraysort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SnakeSorting {

    private static int n;

    private static int x = 0;
    private static int y = 0;

    private static Direction direction = Direction.RIGHT;
    private static int toChangeDirection;

    private static int[][] res;

    private static LinkedList<Integer> list;

    public static void main(String[] args) {

        try {
            initialize(Integer.parseInt(args[0]));
        } catch (Exception e) {
            System.out.println("Cannot parse input params.");
            return;
        }

        for (int i = 0; i < n * n; i++) {
            setElement(list.removeFirst());
            setDirection();
            setIndexes();
        }

        for (int[] line : res) {
            System.out.println(Arrays.toString(line));
        }
    }

    private static void setElement(int element) {
        res[y][x] = element;

    }

    private static void setDirection() {
        if (list.size() % toChangeDirection == 0) {
            if (list.size() < toChangeDirection * toChangeDirection) {
                toChangeDirection--;
            }
            direction = nextDirection();
        }
    }

    private static Direction nextDirection() {
        switch (direction) {
            case RIGHT:
                return Direction.DOWN;
            case DOWN:
                return Direction.LEFT;
            case LEFT:
                return Direction.UP;
            default:
                return Direction.RIGHT;
        }
    }

    private static void setIndexes() {
        switch (direction) {
            case RIGHT:
                x++;
                break;
            case DOWN:
                y++;
                break;
            case LEFT:
                x--;
                break;
            default:
                y--;
                break;
        }
    }

    private static void initialize(final int number) {
        n = number;
        toChangeDirection = n;
        res = new int[n][n];
        list = IntStream.rangeClosed(1, n * n)
                .sorted()
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));
    }

    enum Direction {
        LEFT, DOWN, RIGHT, UP
    }
}
