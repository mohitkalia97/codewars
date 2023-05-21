package my_own_exercises;

import java.util.*;
import java.util.stream.Collectors;
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

    public static double getAverageAge(String name){
        Map<String, List<Integer>> personMap = new HashMap<>();

        personMap.put("Alice", new ArrayList<>(List.of(25, 35, 20)));
        personMap.put("Bob", new ArrayList<>(List.of(30)));
        personMap.put("Charlie", new ArrayList<>(List.of(40)));

        return personMap.entrySet().stream()
                .filter(person -> person.getKey().equals(name))
                .flatMapToInt(stringListEntry -> stringListEntry.getValue()
                        .stream()
                        .mapToInt(Integer::intValue))
                .average()
                .getAsDouble();
    }

    public static int getLengthLongestWord(){
        List<String> wordList = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "kiwi", "pineapple"));
        return wordList.stream()
                .mapToInt(String::length)
                .max()
                .getAsInt();
    }

    public static List<Integer> doubleEvenNumbers(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        return numbers.stream().map(num -> num*2).collect(Collectors.toList());
    }

    public static long countWordsStartingWith(List<String> words, char letter) {
        return words.stream()
                .filter(firstLetter -> (firstLetter.startsWith(String.valueOf(letter))))
                .count();
    }

    public static List<String> getAllUniqueHobbies(List<Person> people){
        return people.stream()
                .flatMap(person -> person.getHobbies().stream()) // Flache die Hobbys zu einer einzigen Stream<String> ab
                .distinct() // Entferne Duplikate
                .sorted() // Sortiere die Hobbys
                .collect(Collectors.toList());
    }

    public static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
        public double add(double a, double b) {
            return a + b;
        }
    }

    public static String getOldestPersonOlderThan25AgeDescByANameCapitalLettersUppercase(){
        List<Person2> person2List = Arrays.asList(
                new Person2("John", 30),
                new Person2("Alice", 28),
                new Person2("Bob", 32),
                new Person2("Emily", 25),
                new Person2("David", 35)
        );


        return person2List.stream()
                .filter(person -> person.getAge()>25)
                .sorted((p1, p2)-> Integer.compare(p2.getAge(), p1.getAge()))
                .map(Person2::getName)
                .findFirst().toString();


    }


    public static void main(String[] args) {


        //System.out.println(getPositivePowersOfTen()); //done
        //System.out.println(toUppercase()); //done
        //System.out.println(getAverageAge("Alice")); //done
        //System.out.println(getLengthLongestWord()); // done
        //System.out.println(doubleEvenNumbers()); // done
        //System.out.println(countWordsStartingWith(Arrays
        //        .asList("apple", "banana", "orange", "kiwi", "pear", "b", "bongo"),
        //        'b'));                            //done
        //List<Person> peopleList = Arrays.asList(
        //       new Person("Alice", Arrays.asList("reading", "painting", "gardening")),
        //       new Person("Bob", Arrays.asList("sports", "cooking", "gardening")),
        //       new Person("Charlie", Arrays.asList("gardening", "traveling")),
        //       new Person("David", Arrays.asList("reading", "photography"))
        //);
        //System.out.println(getAllUniqueHobbies(peopleList)); // done
       /* Calculator c = new Calculator();
        c.add(1,1);*/

        System.out.println(getOldestPersonOlderThan25AgeDescByANameCapitalLettersUppercase()); // done
    }
}





