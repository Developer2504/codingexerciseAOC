package com.aoc.task.notimeforataxicab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class SolutionPartTwo {
    private static Set<String> visited = new HashSet<>();

    public static int firstPointVisitedTwice(String[] data) {
        int direction = 0, x = 0, y = 0, displace;
        int[] ans = null;
        visited.add(x + "," + y);
        boolean found = false;
        for (String s : data) {
            if (found) break;
            direction = Helper.getDirection(s.charAt(0), direction);
            displace = Integer.parseInt(s.substring(1));

            switch (direction) {
                case 0:
                    ans = recordPositiveYmoves(x, y, displace);
                    if (ans != null) {
                        found = true;
                        break;
                    }
                    y += displace;
                    break;
                case 1:
                    ans = recordPositiveXmoves(x, y, displace);
                    if (ans != null) {
                        found = true;
                        break;
                    }
                    x += displace;
                    break;
                case 2:
                    ans = recordNegativeYmoves(x, y, displace);
                    if (ans != null) {
                        found = true;
                        break;
                    }
                    y -= displace;
                    break;
                case 3:
                    ans = recordNegativeXmoves(x, y, displace);

                    if (ans != null) {
                        found = true;
                        break;
                    }
                    x -= displace;
                    break;
            }
        }
        if (ans != null)
            return (Math.abs(ans[0]) + Math.abs(ans[1]));
        else return (Math.abs(x) + Math.abs(y));
    }

    private static int[] recordPositiveXmoves(int x, int y, int displace) {
        for (int i = x + 1; i <= x + displace; i++) {
            String coord = i + "," + y;
            if (visited.contains(coord)) {
                return new int[]{i, y};
            }
            visited.add(coord);
        }
        return null;
    }

    private static int[] recordPositiveYmoves(int x, int y, int displace) {
        for (int i = y + 1; i <= y + displace; i++) {
            String coord = x + "," + i;
            if (visited.contains(coord)) {
                return new int[]{x, i};
            }
            visited.add(coord);
        }
        return null;
    }

    private static int[] recordNegativeXmoves(int x, int y, int displace) {
        for (int i = x - 1; i >= x - displace; i--) {
            String coord = i + "," + y;
            if (visited.contains(coord)) {
                return new int[]{i, y};
            }
            visited.add(coord);
        }
        return null;
    }

    private static int[] recordNegativeYmoves(int x, int y, int displace) {
        for (int i = y - 1; i >= y - displace; i--) {
            String coord = x + "," + i;
            if (visited.contains(coord)) {
                return new int[]{x, i};

            }
            visited.add(coord);
        }
        return null;
    }


    public static void runner() {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("src/main/resources/inputs/inputforq1.txt"))
        ) {
            String[] data = fileReader.readLine().split(", ");
            System.out.println("First location you visited twice is " + firstPointVisitedTwice(data) + " blocks away.");
        } catch (Exception x) {
            System.out.println("Exception");
        }

    }
}