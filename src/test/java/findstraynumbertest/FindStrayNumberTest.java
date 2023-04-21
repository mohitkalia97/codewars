package findstraynumbertest;

import findstraynumber.FindStrayNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindStrayNumberTest {
    @ParameterizedTest
    @CsvSource({
            " 2,  1, 2,  2,  2,  2,  2,  2",
            "17, 17, 3, 17, 17, 17, 17,  3",
            "-1, -1,-2, -1, -1, -1, -1, -2",
            " 0,  0, 1,  0,  0,  0,  0,  1",
            " 1,  1, 0,  1,  1,  1,  1,  0",
            "-1, -1, 0, -1, -1, -1, -1, -1,"
    })
    public void testFindStrayNumber(int expectedOutput, int a, int b, int c, int d, int e, int f){
        int[]intArray = {a,b,c,d,e,f};
        assertEquals(expectedOutput, FindStrayNumber.findStrayNumber(intArray));
    }
}
