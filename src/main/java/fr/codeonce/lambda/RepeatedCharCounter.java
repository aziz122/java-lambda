package fr.codeonce.lambda;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RepeatedCharCounter {
    public static int countOccurrences(String text, String word) {
        // Convert the text to lowercase to make the search case-insensitive
        String lowercaseText = text.toLowerCase();
        
        // Split the text into words and filter out words that are not equal to the search word
        return Arrays.stream(lowercaseText.split("\\W+"))
                     .filter(w -> w.equals(word.toLowerCase()))
                     .collect(Collectors.toList())
                     .size();
    }
}
