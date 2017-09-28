package datastructures;

import common.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/ctci-making-anagrams

class MakingAnagrams implements Exercise {

    private Map<Character, Integer> buildCharFrequencyFor(String sentence) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            Character c = sentence.charAt(i);
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        return frequency;
    }

    public void solve() {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        Map<Character, Integer> s1Frequency = buildCharFrequencyFor(s1);
        Map<Character, Integer> s2Frequency = buildCharFrequencyFor(s2);

        int differences = 0;
        for (Character c : s1Frequency.keySet()) {
            int countS1 = s1Frequency.get(c);
            int countS2 = s2Frequency.getOrDefault(c, 0);

            differences += abs(countS1 - countS2);
        }

        for (Character c : s2Frequency.keySet()) {
            if (!s1Frequency.containsKey(c)) {
                differences += s2Frequency.get(c);
            }
        }

        out.println(differences);
    }
}
