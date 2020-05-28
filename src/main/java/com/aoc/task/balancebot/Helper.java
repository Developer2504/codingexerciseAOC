package com.aoc.task.balancebot;

import java.util.*;

public class Helper {
    static int[] output = new int[1000];



    public static Map<String, List<Integer>> processStatement(List<String> stringList) {
        List<String> visited = new ArrayList<>();
        Map<String, List<Integer>> map = new TreeMap<>();
        while (stringList.size() != 0) {

            for (String s : stringList) {
                String arr[] = s.split(" ");
                if (arr[0].equals("value")) {
                    List<Integer> list = map.containsKey(arr[5]) ? new ArrayList<>(map.get(arr[5])) : new ArrayList<>(2);
                    list.add(Integer.parseInt(arr[1]));
                    map.put(arr[5], list);
                    visited.add(s);
                } else {
                    List<Integer> integers = map.containsKey(arr[1]) ? map.get(arr[1]) : new ArrayList<>();
                    if (integers.size() == 2) {
                        Collections.sort(integers);
                        if (arr[5].equals("bot")) {
                            List<Integer> list = map.containsKey(arr[6]) ? new ArrayList<>(map.get(arr[6])) : new ArrayList<>();
                            list.add(integers.get(0));
                            map.put(arr[6], list);
                        } else {
                            output[Integer.parseInt(arr[6])] = integers.get(0);
                        }
                        if (arr[10].equals("bot")) {
                            List<Integer> list = map.containsKey(arr[11]) ? new ArrayList<>(map.get(arr[11])) : new ArrayList<>();
                            list.add(integers.get(1));
                            map.put(arr[11], list);
                        }
                        visited.add(s);
                    }
                }

            }
            stringList.removeAll(visited);
            visited = new ArrayList<>();
        }
        return map;


    }

}
