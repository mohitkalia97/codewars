package twotoonetest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import twotoone.TwoToOne;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoToOneTest {
    @ParameterizedTest
    @CsvSource({"ab, cd, abcd ",
                "ac, bd, abcd",
                "ad, bc, abcd",
                "cd, ba, abcd",
                "abcdefghijklmnopqrstuvwxyz,, abcdefghijklmnopqrstuvwxyz"
    })
    public void testTwoToOne(String a, String b, String expectedOutput){

        assertEquals(expectedOutput, TwoToOne.longest(a, b));
    }
}
