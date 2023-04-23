package findtheparityoutliertest;

import findtheparityoutlier.FindTheParityOutlier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheParityOutlierTest {
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
