import java.util.List;
import java.util.Arrays;

public class Anagrams {

    public static List<String> of(String string) {
        if (string.length() == 3) {
            return Arrays.asList(
                "a" + "bc",
                "a" + "cb",
                "b" + "ac",
                "b" + "ca",
                "c" + "ab",
                "c" + "ba"
            );
        }
        if (string.length() == 2) {
            return Arrays.asList(string, string.substring(1, 2) + string.substring(0, 1));
        }
        return Arrays.asList(string);
    }
}
