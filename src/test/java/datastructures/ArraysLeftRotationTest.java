package datastructures;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class ArraysLeftRotationTest extends InOutTest{
    private Exercise exercise = new ArraysLeftRotation();

    private static final String INPUT_SAMPLE0 = "5 4\n" +
            "1 2 3 4 5\n";

    private static final String OUTPUT_SAMPLE0 = "5 1 2 3 4 ";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT_SAMPLE0, OUTPUT_SAMPLE0, exercise);
    }
}