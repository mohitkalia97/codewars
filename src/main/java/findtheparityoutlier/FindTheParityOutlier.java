package findtheparityoutlier;

import java.util.Arrays;

public class FindTheParityOutlier {
    public static int findOutlier(int[] integers){
       /* ArrayList<Integer> usedOdds = new ArrayList<>();
        ArrayList<Integer> usedEvens = new ArrayList<>();

        for (int integer : integers) {
            if(integer % 2 == 0){
                usedEvens.add(integer);
            } else {
                usedOdds.add(integer);
            }
        }
        if (usedEvens.size() == 1) {
            return usedEvens.get(0);
        } else {
            return usedOdds.get(0);
        }*/
        int[] arrayEven = Arrays.stream(integers).filter(i -> i % 2 == 0).toArray();
        return (arrayEven.length == 1) ? arrayEven[0] : Arrays.stream(integers).filter(i -> i % 2 != 0).findAny().getAsInt();
    }
}
