package datastructures;

import common.Exercise;

import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;

//https://www.hackerrank.com/challenges/ctci-balanced-brackets/problem

class BalancedBrackets implements Exercise {
    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);

        int entryCount = parseInt(scanner.nextLine());

        IntStream.range(0, entryCount)
                .forEach(value -> {
                    char[] entry = scanner.nextLine().toCharArray();
                    out.println(isBalanced(entry) ? "YES" : "NO");
                });
    }

    private boolean isBalanced(char[] entry) {
        Stack<Character> parsingStack = new Stack<>();

        for (char current : entry) {
            if (current == '(' || current == '[' || current == '{') {
                parsingStack.push(current);
            } else if (parsingStack.empty()) {
                return false;
            } else {
                char top = parsingStack.pop();
                if (current == ')' && top != '(') {
                    return false;
                } else if (current == ']' && top != '[') {
                    return false;
                } else if (current == '}' && top != '{') {
                    return false;
                }
            }
        }

        return parsingStack.empty();
    }
}
