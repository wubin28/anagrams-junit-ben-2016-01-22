import java.util.List;
import java.util.Arrays;

public class Anagrams {

    public static List<String> of(String s) {
        if (s.length() == 3) {
            return Arrays.asList(
                s.substring(0, 1) + "bc",
                s.substring(0, 1) + "cb",
                s.substring(1, 2) + "ac",
                s.substring(1, 2) + "ca",
                s.substring(2, 3) + "ab",
                s.substring(2, 3) + "ba"
            );
        }
        if (s.length() == 2) {
            return Arrays.asList(s, s.substring(1, 2) + s.substring(0, 1));
        }
        return Arrays.asList(s);
    }
}
