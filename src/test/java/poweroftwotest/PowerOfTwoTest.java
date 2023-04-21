package poweroftwotest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import poweroftwo.PowerOfTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerOfTwoTest {
    @ParameterizedTest
    @CsvSource({
            "333, false",
            "0, false",
            "1, true",
            "4096, true",
            "1024, true"
    })
    public void testPowerOfTwo(long n, boolean expectedOutput){
        assertEquals(expectedOutput, PowerOfTwo.isPowerOfTwo(n));
    }
}
