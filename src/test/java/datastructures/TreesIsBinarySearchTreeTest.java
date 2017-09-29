package datastructures;

import common.InOutTest;
import common.TreeNode;
import common.TypedExercise;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TreesIsBinarySearchTreeTest extends InOutTest {
    private TypedExercise<TreeNode> exercise = new TreesIsBinarySearchTree();

    private static final String OUTPUT_SAMPLE0 = "Yes\n";

    private static final String OUTPUT_CASE1 = "No\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        // 1 2 3 4 5 6 7
        TreeNode root =
                new TreeNode(4,
                        new TreeNode(2,
                                new TreeNode(1),
                                new TreeNode(3)),
                        new TreeNode(6,
                                new TreeNode(5),
                                new TreeNode(7)));


        exercise.solve(root);

        assertThat(output()).isEqualTo(OUTPUT_SAMPLE0);
    }

    @Test
    public void shouldSolveExerciseForFirstTestCase() {
        // 1 2 4 3 5 6 7
        TreeNode root =
                new TreeNode(3,
                        new TreeNode(2,
                                new TreeNode(1),
                                new TreeNode(4)),
                        new TreeNode(6,
                                new TreeNode(5),
                                new TreeNode(7)));


        exercise.solve(root);

        assertThat(output()).isEqualTo(OUTPUT_CASE1);
    }

}