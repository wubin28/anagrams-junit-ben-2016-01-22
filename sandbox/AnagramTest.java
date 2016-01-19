import org.junit.*;
import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void the_anagram_of_a_one_letter_word_should_be_itself() {
        Anagram anagram = new Anagram();

        assertTrue(anagram.generate("a").contains("a"));
    }
}
