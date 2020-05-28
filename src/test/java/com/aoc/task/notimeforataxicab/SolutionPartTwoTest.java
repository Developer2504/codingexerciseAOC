package com.aoc.task.notimeforataxicab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class SolutionPartTwoTest {
    @Test
    public void successOne() {
        String s = "R5, L5, R5, R3";
        int actual = SolutionPartTwo.firstPointVisitedTwice(s.split(", "));
        int expected = 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void successTwo() {
        String s = "L8, L4, L4, L8";
        int actual = SolutionPartTwo.firstPointVisitedTwice(s.split(", "));
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

}
