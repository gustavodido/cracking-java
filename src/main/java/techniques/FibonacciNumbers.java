package techniques;

import common.Exercise;

import java.util.Scanner;

import static java.lang.System.out;

// https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem

class FibonacciNumbers implements Exercise {

    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        out.println(fibonacci(number, 0, 1));
    }

    private int fibonacci(int number, int a, int b) {
        if (number == 0) return a;
        if (number == 1) return b;

        return fibonacci(number - 1, b, a + b);
    }

}
