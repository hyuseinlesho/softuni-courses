package ForLoop_Lecture;

import java.util.Scanner;

public class P02NumbersN_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = number; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}
