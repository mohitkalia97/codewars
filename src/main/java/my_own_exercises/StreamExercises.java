package my_own_exercises;

import java.util.*;
import java.util.stream.Collectors;
public class StreamExercises {

    public static List<Integer> getPositivePowersOfTen(){
        List<Integer> numList= new ArrayList<>(Arrays.asList(1, -2, 3, -4, 5));
        return numList.stream()
                .filter(num -> num > 0)
                .map(num -> num * num)
                .collect(Collectors.toList());
    }

    public static List<String> toUppercase(){
        List<String> strings = new ArrayList<>(Arrays.asList("Hallo", "Welt", "Java", "Streams"));
        return strings.stream().map(String::toUpperCase).toList();
    }





    public static void main(String[] args) {
        //System.out.println(getPositivePowersOfTen()); //done
        //System.out.println(toUppercase()); //done

    }

}





