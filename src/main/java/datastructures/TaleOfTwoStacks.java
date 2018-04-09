package datastructures;

import common.Exercise;

import java.util.Scanner;
import java.util.Stack;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import static java.util.stream.IntStream.range;

// https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem

class TaleOfTwoStacks implements Exercise {
    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);

        int queries = parseInt(scanner.nextLine());

        MyQueue queue = new MyQueue();

        range(0, queries)
                .forEach(value -> {
                    int operation = scanner.nextInt();
                    switch (operation) {
                        case 1:
                            int number = scanner.nextInt();
                            queue.enqueue(number);
                            break;
                        case 2:
                            queue.dequeue();
                            break;
                        case 3:
                            out.println(queue.peek());
                            break;
                    }
                });
    }

    private class MyQueue {
        private Stack<Integer> queue = new Stack<>();
        private Stack<Integer> dequeue = new Stack<>();

        private void dequeueAll() {
            if (dequeue.empty()) {
                while (!queue.empty()) {
                    dequeue.push(queue.pop());
                }
            }
        }

        void enqueue(int number) {
            queue.push(number);
        }

        int dequeue() {
            dequeueAll();
            return dequeue.pop();
        }

        int peek() {
            dequeueAll();
            return dequeue.peek();
        }
    }
}
