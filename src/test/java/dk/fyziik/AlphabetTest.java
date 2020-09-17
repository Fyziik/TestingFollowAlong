package dk.fyziik;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetTest {

    Alphabet a;

    @BeforeEach
    void setUp() {
        a = new Alphabet();
    }

    @Test
    void numberOfVowels() {
        assertEquals(2, a.numberOfVowels("rasmus"));
        assertEquals(3, a.numberOfVowels("andreas"));
    }

    @Test
    void numberOfConsonants() {
        assertEquals(4, a.numberOfConsonants("rasmus"));
        assertEquals(4, a.numberOfConsonants("andreas"));
    }
}