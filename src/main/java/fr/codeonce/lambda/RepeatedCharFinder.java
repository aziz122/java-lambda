package fr.codeonce.lambda;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharFinder {
    public static Optional<Character> findFirstNonRepeatedChar(String input) {
        // Convert the input to lowercase to make the search case-insensitive
        String lowercaseInput = input.toLowerCase();
        
        // Convert the input to a map of characters and their frequencies
        LinkedHashMap<Character, Long> charFrequencies = lowercaseInput.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));
        
        // Find the first character that has a frequency of 1
        return charFrequencies.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst();
    }
}
