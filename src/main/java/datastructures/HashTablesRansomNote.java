package datastructures;

import common.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.out;

// https://www.hackerrank.com/challenges/ctci-ransom-note/problem

class HashTablesRansomNote implements Exercise {

    public void solve() {
        Scanner scanner = new Scanner(System.in);

        // Given code
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }

        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }

        out.println(canUseMagazine(magazine, ransom) ? "Yes" : "No");
    }

    private boolean canUseMagazine(String[] magazine, String[] ransom) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        for(String word : magazine) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        for(String word : ransom) {
            if (wordFrequency.getOrDefault(word, 0) == 0) {
                return false;
            }

            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) - 1);
        }

        return true;
    }
}
