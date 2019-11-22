package io.github.fatihbozik.introduction;

import java.util.Scanner;

/**
 * @author Fatih Bozik
 */
public class IfElse {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int integer = scanner.nextInt();
        if (integer % 2 == 1) {
            System.out.println("Weird");
        } else if (integer >= 2 && integer <= 5) {
            System.out.println("Not Weird");
        } else if (integer >= 6 && integer <= 20) {
            System.out.println("Weird");
        } else if (integer > 20) {
            System.out.println("Not Weird");
        }
    }
}
