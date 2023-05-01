package alphabetwarstest;

import alphabetwar.AlphabetWar;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlphaBetWarTest {
    @ParameterizedTest
    @CsvSource({
            "z,Right side wins!",
            "wwwwwwz,Left side wins!",
            "zdqmwpbs, Let's fight again!"
    })
    public void alphaBetWarTest(String fight, String expectedOutput){
        assertEquals(expectedOutput, AlphabetWar.alphabetWar(fight));
    }
}
