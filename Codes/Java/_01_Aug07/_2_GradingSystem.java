package Java._01_Aug07;

import java.util.Scanner;

public class _2_GradingSystem {

    public static void main(String[] args) {
        // input - don't change this code
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        scn.close();
        // input - don't change this code

        // code here
        // Approach 1
        if (marks > 90)
            System.out.println("excellent");
        else if (marks > 80 && marks <= 90)
            System.out.println("good");
        else if (marks > 70 && marks <= 80)
            System.out.println("fair");
        else if (marks > 60 && marks <= 70)
            System.out.println("meets expectations");
        else
            System.out.println("below par");

        // Approach 2 (Better)
        if (marks > 90)
            System.out.println("excellent");
        else if (marks > 80)
            System.out.println("good");
        else if (marks > 70)
            System.out.println("fair");
        else if (marks > 60)
            System.out.println("meets expectations");
        else
            System.out.println("below par");
    }

}
