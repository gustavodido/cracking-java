package algorithms;

import common.Exercise;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.stream.IntStream.range;

// https://www.hackerrank.com/challenges/ctci-bubble-sort/problem

class SortingBubbleSort implements Exercise {

    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);

        int size = parseInt(scanner.nextLine());
        int[] array = new int[size];

        range(0, size)
                .forEach(value -> {
                    array[value] = scanner.nextInt();
                });

        int swaps = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swaps++;
                    swap(array, j, j + 1);
                }
            }

        }

        out.println(format("Array is sorted in %s swaps.", swaps));
        out.println(format("First Element: %s", array[0]));
        out.println(format("Last Element: %s", array[size - 1]));
    }

    private void swap(int[] array, int j, int i) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
