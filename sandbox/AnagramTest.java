import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;
import static org.hamcrest.CoreMatchers.*;

public class AnagramTest {

    @Test
    public void the_anagram_of_an_empty_string_should_be_itself() {
        assertThat(Anagrams.of(""), is(Arrays.asList("")));
    }

    @Test
    public void the_anagram_of_a_one_letter_word_should_be_itself() {
        assertThat(Anagrams.of("a"), is(Arrays.asList("a")));
    }

    @Test
    public void the_number_of_the_anagrams_of_two_letter_word_should_be_2() {
        assertThat(Anagrams.of("ab"), is(Arrays.asList("ab", "ba")));
    }

    @Test
    public void the_number_of_the_anagrams_of_three_letter_word_should_be_6() {
        assertThat(Anagrams.of("abc"), is(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba")));
    }

    @Test
    public void the_number_of_the_anagrams_of_four_letter_word_should_be_24() {
        assertThat(Anagrams.of("abcd").size(), is(24));
    }

    @Test
    public void the_number_of_the_anagrams_of_five_letter_word_should_be_120() {
        assertThat(Anagrams.of("apple").size(), is(120));
    }
}
