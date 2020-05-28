package com.aoc.task.notimeforataxicab;

import java.io.BufferedReader;
import java.io.FileReader;

public class SolutionPartOne {

    public static int calculateBlocks(String[] data) {
        int direction = 0, x = 0, y = 0, displace;

        for (String s : data) {
            direction = Helper.getDirection(s.charAt(0), direction);
            displace = Integer.parseInt(s.substring(1));
            switch (direction) {
                case 0:
                    y += displace;
                    break;
                case 1:
                    x += displace;
                    break;
                case 2:
                    y -= displace;
                    break;
                case 3:
                    x -= displace;
                    break;
            }
        }
        return (Math.abs(x) + Math.abs(y));
    }

    public static void runner() {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("src/main/resources/inputs/inputforq1.txt"))
        ) {
            String[] data = fileReader.readLine().split(", ");
            System.out.println("Easter Bunny HQ is " + calculateBlocks(data) + " blocks away.");

        } catch (Exception x) {
            System.out.println("Exception");
        }

    }
}
