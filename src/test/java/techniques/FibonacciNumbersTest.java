package techniques;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class FibonacciNumbersTest extends InOutTest {
    private Exercise exercise = new FibonacciNumbers();

    private static final String INPUT_SAMPLE0 = "3\n" +
            "1 2 3\n";

    private static final String OUTPUT_SAMPLE0 = "2\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT_SAMPLE0, OUTPUT_SAMPLE0, exercise);
    }

}