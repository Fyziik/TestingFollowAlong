package dk.fyziik;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringExercisesTest {

    StringExercises exercises;

    @BeforeEach
    void setUp() {
        exercises = new StringExercises();
    }

    @Test
    void donuts() {
        assertEquals("Number of donuts: 4", exercises.donuts(4));
        assertEquals("Number of donuts: 9", exercises.donuts(9));
        assertEquals("Number of donuts: many", exercises.donuts(10));
        assertEquals("Number of donuts: many", exercises.donuts(99));
    }

    @Test
    void bothEnds() {
        assertEquals("spng", exercises.bothEnds("spring"));
        assertEquals("Helo", exercises.bothEnds("Hello"));
        assertEquals("", exercises.bothEnds("a"));
        assertEquals("xyyz", exercises.bothEnds("xyz"));
    }

    @Test
    void fixStart() {
        assertEquals("ba**le", exercises.fixStart("babble"));
        assertEquals("a*rdv*rk", exercises.fixStart("aardvark"));
        assertEquals("goo*le", exercises.fixStart("google"));
        assertEquals("donut", exercises.fixStart("donut"));
    }

    @Test
    void mixUp() {
        assertEquals("pox mid", exercises.mixUp("mix", "pod"));
        assertEquals("dig donner", exercises.mixUp("dog", "dinner"));
        assertEquals("spash gnort", exercises.mixUp("gnash", "sport"));
        assertEquals("fizzy perm", exercises.mixUp("pezzy", "firm"));
    }
}
