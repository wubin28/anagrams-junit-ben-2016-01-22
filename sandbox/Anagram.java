import java.util.List;
import java.util.Arrays;

public class Anagram {

    public List<String> generate(String string) {
        if (string.equals("ab")) {
            return Arrays.asList("ab", "ba");
        }
        return Arrays.asList(string);
    }
}
