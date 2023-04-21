package finduniquenumber;

public class FindUniqueNumber {
    /*
    There is an array with some numbers. All numbers are equal except for one. Try to find it!

    Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
    Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
    It’s guaranteed that array contains at least 3 numbers.

    The tests contain some very huge arrays, so think about performance.*/
    public static double findUniq(double[] arr) {
        double candidate1 = arr[0];
        double candidate2 = arr[1];
        if (candidate1 != candidate2 && candidate2 == arr[2]) {
            return candidate1;
        } else if (candidate1 != candidate2 && candidate1 == arr[2]) {
            return candidate2;
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != candidate1 && arr[i] != candidate2) {
                return arr[i];
            }
        }
        return 0;
    }
}