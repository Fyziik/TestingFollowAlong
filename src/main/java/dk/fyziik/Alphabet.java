package dk.fyziik;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Alphabet {

    private Character[] consonant = {'r', 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 's', 't', 'v', 'x', 'z'}; // 'r'
    private Character[] vowels = {'a', 'e', 'i', 'o', 'y', 'u'}; // 'u'

    // This method takes a String as parameter (a text), and should return an int (the number of vowels in that string)
    public int numberOfVowels(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public int numberOfConsonants(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if(isCosonant(s.charAt(i))){
                count++;
            }
        }
        return count;
    }

    private boolean isVowel(char s){
        Set<Character> characters = new HashSet<>(Arrays.asList(vowels));
        characters.addAll(Arrays.asList());
        return characters.contains(s);
    }

    private boolean isCosonant(char s){
        Set<Character> characters = new HashSet<>(Arrays.asList(consonant));
        characters.addAll(Arrays.asList());
        return characters.contains(s);
    }
}
