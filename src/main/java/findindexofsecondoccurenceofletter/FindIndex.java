package findindexofsecondoccurenceofletter;

public class FindIndex {
    public static int secondSymbol(String str, char c) {
        //DO YOUR MAGIC!!
        if(str==null || str.isEmpty()){
            return -1;
        } else {
            int counter = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    counter++;
                    if (counter == 2) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
