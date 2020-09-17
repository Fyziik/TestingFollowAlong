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
        assertEquals(2, a.numberOfVowels("RASMUS"));
        assertEquals(3, a.numberOfVowels("Andreas"));
        assertEquals(3, a.numberOfVowels("hej med dig"));
    }

    @Test
    void numberOfConsonants() {
        assertEquals(4, a.numberOfConsonants("rasmus"));
        assertEquals(4, a.numberOfConsonants("andreas"));
        assertEquals(6, a.numberOfConsonants("HEJ MED dig"));
    }
}