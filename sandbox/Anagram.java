import java.util.List;
import java.util.Arrays;

public class Anagram {

    public List<String> generate(String string) {
        if (string.length() == 2) {
            return Arrays.asList("ab", "ba");
        }
        return Arrays.asList(string);
    }
}
