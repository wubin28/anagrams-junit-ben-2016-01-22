import org.junit.*;
import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = Anagram.answer();
        assertEquals(expected, actual);
    }
}
