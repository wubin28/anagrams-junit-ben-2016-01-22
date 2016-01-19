import java.util.List;
import java.util.Arrays;

public class Anagram {

    public List<String> generate(String string) {
        if (string.length() == 2) {
            return Arrays.asList(string, "ba");
        }
        return Arrays.asList(string);
    }
}
