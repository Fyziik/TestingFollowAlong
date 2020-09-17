package dk.fyziik;

//    Basic string Unittest exercises
//    Fill in the code for the methods below.
//    A test class is already created and can be found in test -> java -> kea.clbo -> StringExerciseTest
//    If you run the tests now they all fail.
//    Your job is to read the tests and aftervards create the right code for the methods in this StringExercises class.


public class StringExercises {

//    A. donuts
//    Given an int count of a number of donuts, return a string of the form 'Number of donuts: <count>',
//    where <count> is the number passed in.
//    However, if the count is 10 or more, then use the word 'many' instead of the actual count.
//
//    So donuts(5) returns 'Number of donuts: 5'
//    and donuts(23) returns 'Number of donuts: many'

    public String donuts(int count) {
        if (count > 9) {
            return "Number of donuts: many";
        }
        return "Number of donuts: " + count;
    }

//    B. both_ends
//    Given a string s, return a string made of the first 2
//    and the last 2 chars of the original string,
//    so 'spring' yields 'spng'. However, if the string length
//    is less than 2, return instead the empty string.

    public String bothEnds(String s) {
        if (s.length() < 2) {
            return "";
        }
        return s.substring(0, 2) + s.substring(s.length()-2);
    }

//     C. fix_start
//     Given a string s, return a string
//     where all occurences of its first char have
//     been changed to '*', except do not change
//     the first char itself.
//     e.g. 'babble' yields 'ba**le'

    public String fixStart(String s) {
        char firstChar = s.charAt(0);
        String tmp = s.replace(firstChar, '*');
        return firstChar + tmp.substring(1, s.length());
    }



//    D. MixUp
//    Given strings a and b, return a single string with a and b separated
//    by a space '<a> <b>', except swap the first 2 chars of each string.
//    e.g.
//      'mix', pod' -> 'pox mid'
//      'dog', 'dinner' -> 'dig donner'
//    Assume a and b are length 2 or more.

    public String mixUp(String a, String b) {
        String aPart = a.substring(0, 2);
        String bPart = b.substring(0, 2);
        a = bPart + a.substring(2);
        b = aPart + b.substring(2);
        return a + " " + b;
    }

}
