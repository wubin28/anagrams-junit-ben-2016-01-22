import org.junit.*;
import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void the_anagram_of_a_one_letter_word_should_be_itself() {
        Anagram anagram = new Anagram();

        assertTrue(anagram.generate("a").contains("a"));
    }

    // TODO: the_number_of_the_anagrams_of_two_letter_word_should_be_2
    // TODO: the_number_of_the_anagrams_of_three_letter_word_should_be_6
    // TODO: the_number_of_the_anagrams_of_four_letter_word_should_be_24
}
