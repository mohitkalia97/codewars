package greenglassdoortest;

import greenglassdoor.GreenGlassDoor;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreenGlassDoorTest {

    @ParameterizedTest
    @CsvSource({
            "comment, true",
            "sunny, true",
            "aaslan, true",
            "mohit, false",
            "tim, false",
    })
    public void wordCheckerTest(String s, boolean expectedOutput) {
        assertEquals(expectedOutput, GreenGlassDoor.wordChecker(s));
    }

}
