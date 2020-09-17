package dk.fyziik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExercises {

//    A. match_ends
//    Given a List<Strings>, return the count of the number of
//    strings where the string length is 2 or more and the first
//    and last chars of the string are the same.
//    words = ['aba', 'xyz', 'aa', 'x', 'bbb'] --> returns 3

    public int matchEnds(List<String> words){
        int result = 0;
        for (String w : words) {
            if (w.length() > 1 && w.charAt(0) == w.charAt(w.length()-1)){
                result += 1;
            }
        }
        return result;
    }

//        B. frontX
//        Given a list of strings, return a list with the strings
//        in sorted order, except group all the strings that begin with 'x' first.
//        e.g. ['mix', 'xyz', 'apple', 'xanadu', 'aardvark'] yields
//        ['xanadu', 'xyz', 'aardvark', 'apple', 'mix']
//        # Hint: this can be done by making 2 lists and sorting each of them
//        # before combining them.

    public List<String> frontX(List<String> words){
        List<String> x = new ArrayList<>();
        List<String> main = new ArrayList<>();

        for (String w: words) {
            if(w.charAt(0) == 'x'){
                x.add(w);
            } else {
                main.add(w);
            }
        }

        Collections.sort(x);
        Collections.sort(main);

        x.addAll(main);

        return x;

    }
}
