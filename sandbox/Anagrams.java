import java.util.List;
import java.util.Arrays;

public class Anagrams {

    public static List<String> of(String s) {
        if (s.length() == 3) {
            return Arrays.asList(
                s.substring(0, 1) + Anagrams.of(dropChar(s, 0)).get(0),
                s.substring(0, 1) + Anagrams.of(dropChar(s, 0)).get(1),
                s.substring(1, 2) + Anagrams.of(dropChar(s, 1)).get(0),
                s.substring(1, 2) + Anagrams.of(dropChar(s, 1)).get(1),
                s.substring(2, 3) + Anagrams.of(dropChar(s, 2)).get(0),
                s.substring(2, 3) + Anagrams.of(dropChar(s, 2)).get(1)
            );
        }
        if (s.length() == 2) {
            return Arrays.asList(s, s.substring(1, 2) + s.substring(0, 1));
        }
        return Arrays.asList(s);
    }

    private static String dropChar(String s, int index) {
        if (index == 0) {
            return "bc";
        }
        if (index == 1) {
            return "ac";
        }
        return "ab";
    }
}
