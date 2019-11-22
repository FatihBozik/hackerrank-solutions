package io.github.fatihbozik.introduction;

import java.util.Scanner;

public class StdinAndStdout {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int firstNumber = scanner.nextInt();
        final int secondNumber = scanner.nextInt();
        final int thirdNumber = scanner.nextInt();

        System.out.println("\nOutput:");
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
    }
}
