package finduniquenumbertest;

import finduniquenumber.FindUniqueNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindUniqueNumberTest {
    @ParameterizedTest
    @CsvSource({
            "0.5, 1 , 1, 0.5",
            "1, 0.5, 1, 0.5",
            "1,  1,  0.5, 0.5",
            "-1, 0.5, -1, 0.5",
            "1, -0.5, 1, -0.5"
    })
    public void testFindUniqSmallArrays(double a, double b, double c, double expectedOutput){
        double[] arr = {a,b,c};
        assertEquals(expectedOutput, FindUniqueNumber.findUniq(arr));
    }
}
