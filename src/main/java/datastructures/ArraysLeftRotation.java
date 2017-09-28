package datastructures;

import common.Exercise;

import java.util.Scanner;

import static java.lang.System.out;

// https://www.hackerrank.com/challenges/ctci-array-left-rotation

class ArraysLeftRotation implements Exercise {
    public void solve() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();

        scanner.nextLine();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int rotatedIndex = d % n;
        for (int i = 0; i < n; i++) {
            out.format("%s ", array[(rotatedIndex + i) % n]);
        }
    }
}
