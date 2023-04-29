package findindexofsecondoccurenceoflettertest;

import findindexofsecondoccurenceofletter.FindIndex;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindIndexTest {
    @ParameterizedTest
    @CsvSource({
            "Hello world!!!, l, 3",
            "Hello world!!!,o,7",
            "Hello world!!!,a, -1,",
            " ,q, -1",
            "Hello, !, -1"

    })
    public void secondSymbolTest(String str, char c, int exptectedOutput){
        assertEquals(exptectedOutput, FindIndex.secondSymbol(str, c));
    }
}
