package FirstProjectGitlab;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //podpunkt "a"
//        System.out.println("Ile pierwszych kwadratów liczb naturalnych chcesz otrzymać?");
        //int amount = scanner.nextInt();
//        square(amount);
//        System.out.println();
//
//        //podpunkt "b"
//        pointB();
//        System.out.println();

//        //podpunkt "c"
//        System.out.println("Ile początkowych liczb ciągu Fibonacciego chcesz wyświetlić?");
//        amount = scanner.nextInt();
//        fibonacci(amount);
//        System.out.println();
//        fibonacciRecursionRun(amount);


        //podpunkt d
//        System.out.println("Podaj liczbę dla której chcesz uzyskać silnię");
//        amount = scanner.nextInt();

        System.out.println(factorial(15));
        System.out.println(factorialRecursion(15));

    }

    public static void square(int amount) {

        int[] squares = new int[amount];

        for (int i = 1; i <= amount; i++) {
            squares[i - 1] = i * i;
            System.out.print(squares[i - 1] + " ");
        }
    }

    public static void pointB() {

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void fibonacci(int amount) {

        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 2; i < amount; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static int fibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    public static void fibonacciRecursionRun(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }

    public static long factorial(int amount) {
        int factorial = 1;
        for (int i = 1; i <= amount; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static long factorialRecursion(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }

}
