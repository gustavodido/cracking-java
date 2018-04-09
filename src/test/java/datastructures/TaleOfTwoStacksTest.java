package datastructures;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class TaleOfTwoStacksTest extends InOutTest {
    private Exercise exercise = new TaleOfTwoStacks();

    private static final String INPUT_SAMPLE0 = "10\n" +
            "1 42\n" +
            "2\n" +
            "1 14\n" +
            "3\n" +
            "1 28\n" +
            "3\n" +
            "1 60\n" +
            "1 78\n" +
            "2\n" +
            "2\n";

    private static final String OUTPUT_SAMPLE0 = "14\n" +
            "14\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT_SAMPLE0, OUTPUT_SAMPLE0, exercise);
    }

}