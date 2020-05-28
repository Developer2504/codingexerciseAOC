package com.aoc.task.securitythroughobscurity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SecuritySolutionPartOneTest {
    @Test
    public void successValidEncryption(){
        String expected="aaaaa-bbb-z-y-x-123[abxyz]";
        String actual=SecuritySolutionPartOne.encryptionValidation(expected);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void successValidEncryption2(){
        String expected="a-b-c-d-e-f-g-h-987[abcde]";
        String actual=SecuritySolutionPartOne.encryptionValidation(expected);
        Assertions.assertEquals(expected,actual);
    } @Test
    public void successValidEncryption3(){
        String expected="not-a-real-room-404[oarel]";
        String actual=SecuritySolutionPartOne.encryptionValidation(expected);
        Assertions.assertEquals(expected,actual);
    } @Test
    public void notValidEncryption(){
        String expected="totally-real-room-200[decoy]";
        String actual=SecuritySolutionPartOne.encryptionValidation(expected);
        Assertions.assertNotEquals(expected,actual);
        Assertions.assertNull(actual);
    }
}
