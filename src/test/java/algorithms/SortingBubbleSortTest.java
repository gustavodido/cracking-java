package algorithms;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class SortingBubbleSortTest extends InOutTest {
    private Exercise exercise = new SortingBubbleSort();

    private static final String INPUT_SAMPLE0 = "3\n" +
            "1 2 3\n";

    private static final String OUTPUT_SAMPLE0 = "Array is sorted in 0 swaps.\n" +
            "First Element: 1\n" +
            "Last Element: 3\n";

    private static final String INPUT_SAMPLE1 = "3\n" +
            "3 2 1\n";

    private static final String OUTPUT_SAMPLE1 = "Array is sorted in 3 swaps.\n" +
            "First Element: 1\n" +
            "Last Element: 3\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT_SAMPLE0, OUTPUT_SAMPLE0, exercise);
    }

    @Test
    public void shouldSolveExerciseForSecondTestInput() {
        solve(INPUT_SAMPLE1, OUTPUT_SAMPLE1, exercise);
    }

}