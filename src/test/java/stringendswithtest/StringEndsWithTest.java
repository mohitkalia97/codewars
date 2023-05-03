package stringendswithtest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import stringendswith.StringEndsWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class StringEndsWithTest {

    @ParameterizedTest
    @CsvSource({
            "abc, bc, true",
            "abc, d, false",
            "samurai,ai, true",
            "sumo, omo, false",
            "ninja, ja, true",
            "sensei, i, true",
            "samurai, ra, false",
            "abc, abcd, false",
            "abc, abc, true",
            "abcabc, bc, true",
            "ails, fails, false",
            "fails, ails, true",
            "this, fails, false",
            ":-), :-, false",
            "!@#$%^&*) :-), :-), true",
    })
    public void solutionTest(String str, String ending, boolean expectedOutput){
        assertEquals(expectedOutput, StringEndsWith.solution(str, ending));
    }
}
