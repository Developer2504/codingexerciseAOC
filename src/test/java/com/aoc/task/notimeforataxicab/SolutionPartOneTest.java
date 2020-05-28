package com.aoc.task.notimeforataxicab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SolutionPartOneTest {
    @Test
    public void successOne() {
        String s = "R5 R4 R5 R4";
        int actual = SolutionPartOne.calculateBlocks(s.split(" "));
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void successTwo() {
        String s = "R8 R4 R4 R8";
        int actual = SolutionPartOne.calculateBlocks(s.split(" "));
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }


}
