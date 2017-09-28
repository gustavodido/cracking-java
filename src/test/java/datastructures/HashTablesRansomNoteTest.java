package datastructures;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class HashTablesRansomNoteTest extends InOutTest {
    private Exercise exercise = new HashTablesRansomNote();

    private static final String INPUT_SAMPLE0 = "6 4\n" +
            "give me one grand today night\n" +
            "give one grand today\n";

    private static final String OUTPUT_SAMPLE0 = "Yes\n";

    private static final String INPUT_SAMPLE1 = "6 5\n" +
            "two times three is not four\n" +
            "two times two is four\n";

    private static final String OUTPUT_SAMPLE1 = "No\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT_SAMPLE0, OUTPUT_SAMPLE0, exercise);
    }

    @Test
    public void shouldSolveExerciseForSecondTestInput() {
        solve(INPUT_SAMPLE1, OUTPUT_SAMPLE1, exercise);
    }

}