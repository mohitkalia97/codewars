package findstraynumber;

public class FindStrayNumber {
    public static int findStrayNumber(int[] numbers) {
/*
You are given an odd-length array of integers, in which all of them are the same, except for one single number.

Complete the method which accepts such an array, and returns that single different number.

The input array will always be valid! (odd-length >= 3)

Examples
[1, 1, 2] ==> 2
[17, 17, 3, 17, 17, 17, 17] ==> 3
*/
        int starting=0;
        for (int number : numbers) {
            if(number != starting){
                starting = number;
            }
        }
        return starting;
    }
}
