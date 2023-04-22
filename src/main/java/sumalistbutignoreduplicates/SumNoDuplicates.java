package sumalistbutignoreduplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SumNoDuplicates {
    /*
    Please write a function that sums a list, but ignores any duplicate items in the list.

    For instance, for the list [3, 4, 3, 6] , the function should return 10.
    */
    public static int sumNoDuplicates(int[] arr) {
        Set<Integer> noDuplicateSet = new HashSet<>();
        ArrayList<Integer> noDuplicateArrayList = new ArrayList<>();
        int noDuplicateSum = 0;

        for (int i : arr) {
            if (noDuplicateSet.add(i)) {
                noDuplicateArrayList.add(i);
            } else {
                noDuplicateArrayList.remove((Integer) i);
            }
        }
        for (Integer integer : noDuplicateArrayList) {
            noDuplicateSum += integer;
        }
        return noDuplicateSum;
    }
}