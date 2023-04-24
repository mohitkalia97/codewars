package theofficeoneouted;

import java.util.Arrays;

public class Office {
    public static String outed(Person[] meet, String boss) {
        int totalScore = Arrays.stream(meet)
                .mapToInt(person -> person.name.equals(boss) ? person.happiness * 2 : person.happiness)
                .sum();
        int numOfPeople = meet.length + 1; // the +1 is for the boss

        int happinessRating = totalScore / numOfPeople;
        return happinessRating <= 5 ? "Get Out Now!":"Nice Work Champ";
    }
}


