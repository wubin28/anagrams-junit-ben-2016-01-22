import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Anagrams {

    public static List<String> of(String s) {
        if (s.length() <= 1) {
            return Arrays.asList(s);
        }
        List<String> anagrams = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++) {
            List<String> anagramsOfRest = Anagrams.of(dropChar(s, i));
            String droppedChar = s.substring(i, i + 1);
            for (String anagramOfRest : anagramsOfRest) {
                anagrams.add( droppedChar + anagramOfRest);
            }
        } 
        return anagrams;
    }

    private static String dropChar(String s, int index) {
        return s.substring(0, index) + s.substring(index + 1, s.length());
    }
}