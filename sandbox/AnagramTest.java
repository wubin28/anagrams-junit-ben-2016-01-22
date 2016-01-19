import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;

public class AnagramTest {

    @Test
    public void the_anagram_of_a_one_letter_word_should_be_itself() {
        assertThat(Anagrams.of("a"), is(Arrays.asList("a")));
    }

    @Test
    public void the_number_of_the_anagrams_of_two_letter_word_should_be_2() {
        Anagram anagram = new Anagram();

        List<String> result = anagram.generate("ab");

        assertTrue(result.contains("ab"));
        assertTrue(result.contains("ba"));
    }

    @Test
    public void the_number_of_the_anagrams_of_three_letter_word_should_be_6() {
        Anagram anagram = new Anagram();

        List<String> result = anagram.generate("abc");

        assertTrue(result.contains("abc"));
        assertTrue(result.contains("acb"));
        assertTrue(result.contains("bac"));
        assertTrue(result.contains("bca"));
        assertTrue(result.contains("cab"));
        assertTrue(result.contains("cba"));
    }

    // TODO: the_number_of_the_anagrams_of_four_letter_word_should_be_24
}
