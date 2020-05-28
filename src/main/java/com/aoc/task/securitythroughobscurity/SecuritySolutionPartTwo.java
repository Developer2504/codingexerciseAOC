package com.aoc.task.securitythroughobscurity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SecuritySolutionPartTwo {


    static int decrypt(String s) {
        int sectorId = Integer.parseInt(s.substring(s.lastIndexOf("-") + 1, s.indexOf("[")));

        s = s.substring(0, s.lastIndexOf('-'));
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (Character.isLetter(c[i])) {
                int offset = c[i] - 'a';
                c[i] = (char) ((offset + sectorId) % 26 + 'a');
            } else {
                c[i] = ' ';
            }
        }
        s = new String(c);
        if (s.contains("northpole")) {

            return sectorId;
        }
        return 0;

    }

    public static void runner() {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("src/main/resources/inputs/inputforq4.txt")));
        ) {
            InputStream inputStream = SecuritySolutionPartTwo.class.getResourceAsStream("inputs/inputforq4.txt");

            List<String> encrypt = reader.lines().map(SecuritySolutionPartOne::encryptionValidation).filter(Objects::nonNull).collect(Collectors.toList());
            int seco = 0;
            for (String s : encrypt) {
                seco = decrypt(s);
                if (seco != 0) break;
            }
            System.out.println(seco + " is the sector ID of the room where North Pole objects are stored.");
        } catch (Exception e) {
            System.out.println("Exception Occured!!");
        }
    }

}

