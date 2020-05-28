package com.aoc.task.securitythroughobscurity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SecuritySolutionPartOne {
    static int result = 0;

    static String encryptionValidation(String s) {
        int secto = Integer.parseInt(s.substring(s.lastIndexOf("-") + 1, s.indexOf("[")));
        String checksum = s.substring(s.indexOf('[') + 1, s.indexOf(']'));
        int a[] = new int[26];
        for (char c : s.substring(0, s.lastIndexOf("-")).replace("-", "").toCharArray()) {
            a[c - 'a']++;
        }
        boolean valid = true;
        int max = a[checksum.charAt(0) - 'a'];
        for (int i = 1; i < checksum.length(); i++) {
            char c = checksum.charAt(i);
            if (a[c - 'a'] == 0) valid = false;
            if (max == a[c - 'a'] && checksum.charAt(i - 1) > c) {
                valid = false;
            } else if (max < a[c - 'a']) valid = false;
            else {
                max = a[c - 'a'];
            }
            if (!valid) break;
        }
        if (valid) {
            result += secto;
            return s;
        } else return null;

    }


    public static void runner() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("src/main/resources/inputs/inputforq4.txt")));
            reader.lines().forEach(SecuritySolutionPartOne::encryptionValidation);
            System.out.println("Sum of sectorId of all the real rooms is " + result);

        } catch (Exception e) {
            System.out.println("Exception Occured!!");
        }
    }

}
