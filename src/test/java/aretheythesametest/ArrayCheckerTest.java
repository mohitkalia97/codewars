package aretheythesametest;

import aretheythesame.ArrayChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayCheckerTest {

    @ParameterizedTest
    @MethodSource("providedArrays")
    public void compTest(int[] a, int[] b, boolean expected){
        assertEquals(expected, ArrayChecker.comp(a,b));
    }

    private static Stream<Arguments> providedArrays(){
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};

        int[] c = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] d = {132, 14641, 20736, 361, 25921, 361, 20736, 361};

        return Stream.of(
                Arguments.of(a, b, true),
                Arguments.of(c, d, false)
        );
    }
}
