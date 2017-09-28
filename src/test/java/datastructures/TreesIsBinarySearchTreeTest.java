package datastructures;

import common.InOutTest;
import common.Node;
import common.TypedExercise;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TreesIsBinarySearchTreeTest extends InOutTest {
    private TypedExercise<Node> exercise = new TreesIsBinarySearchTree();

    private static final String OUTPUT_SAMPLE0 = "Yes\n";

    private static final String OUTPUT_CASE1 = "No\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        // 1 2 3 4 5 6 7
        Node root =
                new Node(4,
                        new Node(2,
                                new Node(1),
                                new Node(3)),
                        new Node(6,
                                new Node(5),
                                new Node(7)));


        exercise.solve(root);

        assertThat(output()).isEqualTo(OUTPUT_SAMPLE0);
    }

    @Test
    public void shouldSolveExerciseForFirstTestCase() {
        // 1 2 4 3 5 6 7
        Node root =
                new Node(3,
                        new Node(2,
                                new Node(1),
                                new Node(4)),
                        new Node(6,
                                new Node(5),
                                new Node(7)));


        exercise.solve(root);

        assertThat(output()).isEqualTo(OUTPUT_CASE1);
    }

}