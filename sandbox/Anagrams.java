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
        anagrams.add(s.substring(0, 1) + Anagrams.of(dropChar(s, 0)).get(0));
        anagrams.add(s.substring(0, 1) + Anagrams.of(dropChar(s, 0)).get(1));
        anagrams.add(s.substring(1, 2) + Anagrams.of(dropChar(s, 1)).get(0));
        anagrams.add(s.substring(1, 2) + Anagrams.of(dropChar(s, 1)).get(1));
        anagrams.add(s.substring(2, 3) + Anagrams.of(dropChar(s, 2)).get(0));
        anagrams.add(s.substring(2, 3) + Anagrams.of(dropChar(s, 2)).get(1));
        return anagrams;
    }

    private static String dropChar(String s, int index) {
        return s.substring(0, index) + s.substring(index + 1, s.length());
    }
}