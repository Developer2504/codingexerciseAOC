package com.aoc.task.securitythroughobscurity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SecuritySolutionPartTwoTest {
    @Test
    public void successNorthPole(){
        String s="ghkmaihex-hucxvm-lmhktzx-267[hmxka]";
        int expected=267;
        int acutal=SecuritySolutionPartTwo.decrypt(s);
        Assertions.assertEquals(expected,acutal);
    }
    @Test
    public void failureNorthPole(){
        String s="ghkmaihex-hucxvm-lmhktzx-254[hmxka]";
        int expected=267;
        int acutal=SecuritySolutionPartTwo.decrypt(s);
        Assertions.assertNotEquals(expected,acutal);
    }
}
