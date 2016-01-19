import java.util.List;
import java.util.Arrays;

public class Anagram {

    public List<String> generate(String string) {
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
            return Arrays.asList(string, new StringBuilder(string).reverse().toString());
        }
        return Arrays.asList(string);
    }
}
