package interactivedictionary;

import java.util.HashMap;

/*
DESCRIPTION:
        In this kata, your job is to create a class Dictionary which you can add words to and their entries. Example:

        >>> Dictionary d = new Dictionary();

        >>> d.newEntry("Apple", "A fruit that grows on trees");

        >>> System.out.println(d.look("Apple"));
        A fruit that grows on trees

        >>> System.out.println(d.look("Banana"));
        Cant find entry for Banana
        Good luck and happy coding!
*/
public class InteractiveDictionary {
    public HashMap<String, String> dictionary = new HashMap<>();
    public InteractiveDictionary() {
    }
    public void newEntry(String key, String value){
        // your code
        dictionary.put(key, value);
    }

    public String look(String key){
        // your code
        if(dictionary.containsKey(key)){
            return dictionary.get(key);
        } else {
            return "Cant find entry for " +key;
        }
    }
}
