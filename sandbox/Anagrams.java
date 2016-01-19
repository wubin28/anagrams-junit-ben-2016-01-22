import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Anagrams {

    public static List<String> of(String s) {
        if (s.length() <= 1) {
            return Arrays.asList(s);
        }
        if (s.length() == 2) {
            return Arrays.asList(s, s.substring(1, 2) + s.substring(0, 1));
        }
        List<String> anagrams = new ArrayList<String>();

        for (int i = 0; i < 3; i++) {
            anagrams.add(s.substring(i, i + 1) + Anagrams.of(dropChar(s, i)).get(0));
            anagrams.add(s.substring(i, i + 1) + Anagrams.of(dropChar(s, i)).get(1));
        } 
        return anagrams;
    }

    private static String dropChar(String s, int index) {
        return s.substring(0, index) + s.substring(index + 1, s.length());
    }
}