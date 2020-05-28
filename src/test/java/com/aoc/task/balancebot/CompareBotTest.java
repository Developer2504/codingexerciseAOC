package com.aoc.task.balancebot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class CompareBotTest {
    @Test
    public void validTestCase(){
        List<String> strings=new ArrayList<>();
        strings.add("value 5 goes to bot 2");
        strings.add("bot 2 gives low to bot 1 and high to bot 0");
        strings.add("value 3 goes to bot 1");
        strings.add("bot 1 gives low to output 1 and high to bot 0");
        strings.add("bot 0 gives low to output 2 and high to output 0");
        strings.add("value 2 goes to bot 2");
        String actual=CompareBot.findBot(strings,5,2);
        String expected="2";
        Assertions.assertEquals(expected,actual);
    }
}
