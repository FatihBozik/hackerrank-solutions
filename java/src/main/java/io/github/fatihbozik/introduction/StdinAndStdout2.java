package io.github.fatihbozik.introduction;

import java.util.Scanner;

/**
 * @author Fatih Bozik
 */
public class StdinAndStdout2 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int integer = scanner.nextInt();
        final double floatingPoint = scanner.nextDouble();
        scanner.nextLine(); // It consumes the \n character
        final String string = scanner.nextLine();

        System.out.println("String: " + string);
        System.out.println("Double: " + floatingPoint);
        System.out.println("Int: " + integer);
    }
}
