package convertstringtocamelcase;

public class StringToCamelCase {
    public static String StringToCamelCase(String s){
        StringBuilder a = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '-' || s.charAt(i) == '_') {
                a.append(Character.toUpperCase(s.charAt(i + 1)));
                i++;
            }else {
                a.append(s.charAt(i));
            }
        }
        return String.valueOf(a);
    }
}
