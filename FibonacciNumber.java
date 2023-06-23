package application;

import java.util.Scanner;

public class FibonacciNumber {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int count = scanner.nextInt();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

