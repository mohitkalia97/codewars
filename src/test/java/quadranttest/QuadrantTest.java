package quadranttest;

import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import quadrants.Quadrants;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadrantTest {
    @ParameterizedTest
    @CsvSource({
            " 1,  1, 1",
            "-1, -1, 3",
            " 1, -1, 4",
            "-1,  1, 2",
            " 1,  2, 1",
            " 3,  5, 1",
            "-10, 100, 2",
            "-1,  -9, 3"
    })
    public void testQuadrant(int x, int y, int expectedQuadrant){
        assertEquals(expectedQuadrant, Quadrants.quadrant(x,y));
    }
}
