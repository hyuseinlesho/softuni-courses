package Exersise;

import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        for (int i = n; i <= p ; i++) {
            System.out.print((char) i + " ");
        }
    }
}
