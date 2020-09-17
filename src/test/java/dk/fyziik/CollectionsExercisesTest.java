package dk.fyziik;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsExercisesTest {

    CollectionsExercises ce;

    @BeforeEach
    void setUp() {
        ce = new CollectionsExercises();
    }

    @Test
    void matchEnds() {
        //    words = ['aba', 'xyz', 'aa', 'x', 'bbb'] --> returns 3
        ArrayList<String> tmp = new ArrayList<>();
        tmp.add("aba");
        tmp.add("xyz");
        tmp.add("aa");
        tmp.add("x");
        tmp.add("bbb");
        assertEquals(3, ce.matchEnds(tmp));
    }

    @Test
    void frontX() {
        //        e.g. ['mix', 'xyz', 'apple', 'xanadu', 'aardvark'] yields
        //        ['xanadu', 'xyz', 'aardvark', 'apple', 'mix']
        ArrayList<String> toBeSorted = new ArrayList<>();
        toBeSorted.add("mix");
        toBeSorted.add("xyz");
        toBeSorted.add("apple");
        toBeSorted.add("xanadu");
        toBeSorted.add("aardvark");

        ArrayList<String> sorted = new ArrayList<>();
        sorted.add("xanadu");
        sorted.add("xyz");
        sorted.add("aardvark");
        sorted.add("apple");
        sorted.add("mix");

        assertEquals(sorted, ce.frontX(toBeSorted));
    }
}