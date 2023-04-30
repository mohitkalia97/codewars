package datareverse;

import java.util.ArrayList;
import java.util.List;

public class DataReverse {

    public static int[] DataReverser(int[] data) {
        int[] arr = new int[data.length];
        for (int i = 0; i < data.length; i += 8) {
            System.arraycopy(data, i, arr, data.length - i - 8, 8);
        }
        return arr;
    }
}
