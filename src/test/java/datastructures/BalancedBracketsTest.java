package datastructures;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class BalancedBracketsTest extends InOutTest{
    private Exercise exercise = new BalancedBrackets();

    private static final String INPUT_SAMPLE0 = "3\n" +
            "{[()]}\n" +
            "{[(])}\n" +
            "{{[[(())]]}}\n";

    private static final String OUTPUT_SAMPLE0 = "YES\n" +
            "NO\n" +
            "YES\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT_SAMPLE0, OUTPUT_SAMPLE0, exercise);
    }
}