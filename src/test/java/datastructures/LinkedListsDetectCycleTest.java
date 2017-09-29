package datastructures;

import common.InOutTest;
import common.LinkedListNode;
import common.TypedExercise;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LinkedListsDetectCycleTest extends InOutTest {
    private TypedExercise<LinkedListNode> exercise = new LinkedListsDetectCycle();

    private static final String OUTPUT_SAMPLE0 = "0\n";

    private static final String OUTPUT_SAMPLE1 = "1\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        LinkedListNode node = new LinkedListNode(10);
        exercise.solve(node);

        assertThat(output()).isEqualTo(OUTPUT_SAMPLE0);
    }

    @Test
    public void shouldSolveExerciseForSecondTestInput() {
        LinkedListNode node2 = new LinkedListNode(2, new LinkedListNode(3));
        LinkedListNode head = new LinkedListNode(1, node2);

        // Cycle
        head.next.next.next = node2;

        exercise.solve(head);

        assertThat(output()).isEqualTo(OUTPUT_SAMPLE1);
    }
}