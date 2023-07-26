package twotoone;

import java.util.*;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        String joinedString = s1 + s2;

        HashSet<Character> distinctSet = new HashSet<>();

        for (char c : joinedString.toCharArray()) {
            distinctSet.add(c);
        }

        List<Character> characterList = distinctSet.stream().sorted().toList();

        StringBuilder sb1 = new StringBuilder();
        for (Character character : characterList) {
            sb1.append(character);
        }

        return sb1.toString();
    }

    // String ist nicht mutable, StringBuilder schon
    // Man kann also Zeichenketten verändern ohne
    // immer wieder neue String Objekte zu erstellen -> Leistungssteigerung
    // StringBuilder bietet auch Methoden an wie zB append, insert und delete
    // Weiters: wesentlich effizienter als viele String-Konkatenierungen mit +
}
