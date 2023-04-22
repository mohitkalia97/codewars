package sumalistbutignoreduplicatestest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import sumalistbutignoreduplicates.SumNoDuplicates;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumNoDuplicatesTes {
    @ParameterizedTest
    @CsvSource({
            "3,4,3,6,10",
            "0,5,5,4,4",
            "5,5,1,6,7"
    })
    public void testSumNoDuplicates(int a, int b, int c, int d, int expectedOutput){
        int[] arr = {a,b,c,d};
        assertEquals(expectedOutput, SumNoDuplicates.sumNoDuplicates(arr));
    }
}
