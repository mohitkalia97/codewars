package calculateaverage;

import java.util.Arrays;

public class CalculateAverage {
    public static double find_average(int[] array){
        return (array.length == 0) ? 0 : Arrays.stream(array).average().getAsDouble();
    }
}
