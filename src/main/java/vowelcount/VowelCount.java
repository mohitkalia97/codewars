package vowelcount;

import java.util.Arrays;
import java.util.List;
public class VowelCount {
    public static int getCount(String str){
        String[] vowels = {"a", "e", "i", "o", "u"};
        int counter=0;
        List<String> strArray = Arrays.stream(str.split(""))
                .toList();
        for (String s : strArray) {
            for (String vowel : vowels) {
                if(s.equals(vowel)){
                    counter++;
                }
            }
        }
        return counter;
    }
}
