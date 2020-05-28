package com.aoc.task.balancebot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CompareBot {
    static Map<String, List<Integer>> map = new TreeMap<>();

    static String findBot(List<String> stringList, int param1, int param2) {
        Map<String, List<Integer>> map = Helper.processStatement(stringList);
        List<Integer> search = new ArrayList<>();
        search.add(param1);
        search.add(param2);
        System.out.println("Question 1: what is the number of the bot that is responsible for comparing value-61 microchips with value-17 microchips?");
        for (Map.Entry<String, List<Integer>> listEntry : map.entrySet()) {
            if (listEntry.getValue().containsAll(search)) {
                return listEntry.getKey();
            }
        }

        return null;
    }


    public static void runner() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("src/main/resources/inputs/inputforq10.txt")));
            List<String> stringList = reader.lines().collect(Collectors.toList());
            System.out.println("The number of the bot that is responsible for comparing given microchips is " + findBot(stringList, 61, 17));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
