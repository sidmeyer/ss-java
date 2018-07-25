package ssjava.numbersequence;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main2 {

    private static int n = 5;

    private static int x = 0;
    private static int y = 0;

    private static Direction direction = Direction.LEFT;
    private static int toChangeDirection = n;

    private static int[][] res = new int[n][n];

    private static LinkedList<Integer> list = new LinkedList<>(IntStream.rangeClosed(1, n * n)
            .sorted()
            .mapToObj(Integer::new)
            .collect(Collectors.toList()));

    public static void main(String[] args) {

    for (int i = 0; i < n * n; i++) {
        setElement(list.removeFirst());
        setDirection();
        setIndexes();
    }

        System.out.println(Arrays.deepToString(res));
    }

    static void setElement(int element) {
        res[x][y] = element;

    }

    static void setDirection() {
        if (list.size() % toChangeDirection == 0) {
            toChangeDirection--;
            direction = nextDirection();
        }
    }

    private static Direction nextDirection() {
        switch (direction) {
            case LEFT:
                return Direction.DOWN;
            case DOWN:
                return Direction.RIGHT;
            case RIGHT:
                return Direction.UP;
            default:
                return Direction.LEFT;
        }
    }

    private static void setIndexes() {
        switch (direction) {
            case LEFT:
                x++;
                break;
            case DOWN:
                y++;
                break;
            case RIGHT:
                x--;
                break;
            default:
                y--;
                break;
        }
    }

    enum Direction {
        LEFT, DOWN, RIGHT, UP
    }
}
