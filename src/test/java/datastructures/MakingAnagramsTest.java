package datastructures;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class MakingAnagramsTest extends InOutTest {
    private Exercise exercise = new MakingAnagrams();

    private static final String INPUT_SAMPLE0 = "cde\n" +
            "abc\n";

    private static final String OUTPUT_SAMPLE0 = "4\n";

    private static final String INPUT_RANDOM0 = "abcdefghjkoiij\n" +
            "abc\n";

    private static final String OUTPUT_RANDOM0 = "11\n";

    private static final String INPUT_CASE1 = "fcrxzwscanmligyxyvym\n" +
            "jxwtrhvujlmrpdoqbisbwhmgpmeoke\n";

    private static final String OUTPUT_CASE1 = "30\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT_SAMPLE0, OUTPUT_SAMPLE0, exercise);
    }

    @Test
    public void shouldSolveExerciseForFirstRandomInput() {
        solve(INPUT_RANDOM0, OUTPUT_RANDOM0, exercise);
    }

    @Test
    public void shouldSolveExerciseForFirstCaseInput() {
        solve(INPUT_CASE1, OUTPUT_CASE1, exercise);
    }

}