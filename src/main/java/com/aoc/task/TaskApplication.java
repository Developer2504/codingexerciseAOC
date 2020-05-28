package com.aoc.task;

import com.aoc.task.balancebot.CompareBot;
import com.aoc.task.balancebot.FirstThreeOutput;
import com.aoc.task.notimeforataxicab.SolutionPartOne;
import com.aoc.task.notimeforataxicab.SolutionPartTwo;
import com.aoc.task.securitythroughobscurity.SecuritySolutionPartOne;
import com.aoc.task.securitythroughobscurity.SecuritySolutionPartTwo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
        Scanner sc = new Scanner(System.in);



		while (true) {
			System.out.println("\n\nTo run NoTimeForATaxiCab Solution 1,Press 11");
			System.out.println("To run NoTimeForATaxiCab Solution 2,Press 12");
			System.out.println("To run Security Through Obscurity Solution 1,Press 41");
			System.out.println("To run Security Through Obscurity Solution 2,Press 42");
			System.out.println("To run Compare Bots Solution 1,Press 101");
			System.out.println("To run Compare Bots Solution 2,Press 102");
			System.out.println("TO Exit Press 0");
			System.out.println("Enter Choice: ");
			int choice = sc.nextInt();
            switch (choice) {
				case 0:System.exit(1);
                case 11:
                    SolutionPartOne.runner();
                    break;
                case 12:
                    SolutionPartTwo.runner();
                    break;
                case 41:
                    SecuritySolutionPartOne.runner();
                    break;
                case 42:
                    SecuritySolutionPartTwo.runner();
                    break;
                case 101:
                    CompareBot.runner();
                    break;
                case 102:
                    FirstThreeOutput.runner();
                    break;
                default:
                    System.out.println("Wrong Input! Re-run App. Thanks");
            }
        }
    }

}
