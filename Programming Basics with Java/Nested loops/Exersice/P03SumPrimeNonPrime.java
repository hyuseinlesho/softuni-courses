package NestedLoops_Exersise;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);

            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            int nonPrime = 0;
            for (int i = 2; i < number ; i++) {
                if (number % i == 0 && number != 2) {
                    nonPrime++;
                }
            }
            if (nonPrime > 0) {
                sumNonPrime += number;
            } else {
                sumPrime += number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n",sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d",sumNonPrime);
    }
}
