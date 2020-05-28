package com.aoc.task.notimeforataxicab;

public class Helper {
    public static int getDirection(char c, int current) {
        return c == 'R' ? (current + 1) % 4 : (current + 3) % 4;
    }
}
