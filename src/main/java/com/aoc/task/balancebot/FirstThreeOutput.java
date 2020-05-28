package com.aoc.task.balancebot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class FirstThreeOutput {
    public static void runner() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("src/main/resources/inputs/inputforq10.txt")));
            List<String> stringList = reader.lines().collect(Collectors.toList());
            Helper.processStatement(stringList);
            int output[]=Helper.output;
            System.out.println("If you multiply together the values of one chip in each of outputs 0, 1, and 2 then answer will be " + output[0] * output[1] * output[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
