package findtheoddInt;

import java.util.*;
/*
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples
[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
*/
public class FindOdd {
    public static int findOddInt(int[] a) {
        Map<Integer, Integer> intMap = new HashMap<>();

        for (int num : a) {
            if (intMap.containsKey(num)) {
                intMap.put(num, intMap.get(num) + 1);
            } else {
                intMap.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : intMap.entrySet()) {
            if(entry.getValue() % 2 != 0){
                return entry.getKey();
            }
        }
        return 0;
    }
   /* public static void main(String[] args) {
        System.out.println(findOddInt(new int[]{1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1}));
    }*/
}















