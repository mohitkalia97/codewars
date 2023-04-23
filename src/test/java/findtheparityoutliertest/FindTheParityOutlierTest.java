package findtheparityoutliertest;

import findtheparityoutlier.FindTheParityOutlier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheParityOutlierTest {
   /* @ParameterizedTest
    @CsvSource({
            "1,1,1,2,1,1,2",
            "2,2,2,1,2,2,2",
            "2,6,8,-10,3,3",
            "206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781,206847684",
            "Integer.MAX_VALUE, 0, 1, 0"
    })
    public void testFindOutlier(int[] integers, int expectedOutput){
        assertEquals(expectedOutput, integers);
    }*/
   @Test
   public void testFindOutlier() {
       int[] arr1 = {2, 4, 6, 8, 10, 3, 12};
       int[] arr2 = {1, 3, 5, 7, 9, 11, 12};
       int[] arr3 = {2, 4, 0, 100, 4, 11, 2602, 36};
       int[] arr4 = {160, 3, 1719, 19, 11, 13, -21};
       assertEquals(3, FindTheParityOutlier.findOutlier(arr1));
       assertEquals(12, FindTheParityOutlier.findOutlier(arr2));
       assertEquals(11, FindTheParityOutlier.findOutlier(arr3));
       assertEquals(160, FindTheParityOutlier.findOutlier(arr4));
   }
}
