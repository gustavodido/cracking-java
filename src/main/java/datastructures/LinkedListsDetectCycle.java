package datastructures;

// https://www.hackerrank.com/challenges/ctci-linked-list-cycle/problem

import common.LinkedListNode;
import common.TypedExercise;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

class LinkedListsDetectCycle implements TypedExercise<LinkedListNode> {
    public void solve(LinkedListNode head) {
        List<LinkedListNode> visitedNodes = new ArrayList<>();

        boolean hasCycle = false;
        while(head != null) {
            if (visitedNodes.contains(head)) {
                hasCycle = true;
                break;
            }

            visitedNodes.add(head);
            head = head.next;
        }

        out.println(hasCycle ? 1 : 0);
    }
}
