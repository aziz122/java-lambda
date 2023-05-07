package fr.codeonce.lambda;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepeatedCharFinderTest {
    @Test
    public void testFindFirstNonRepeatedChar() {
        String input = "stress";
        Optional<Character> result = RepeatedCharFinder.findFirstNonRepeatedChar(input);
        Assertions.assertEquals('t', result.get());
        
        input = "ovale";
        result = RepeatedCharFinder.findFirstNonRepeatedChar(input);
        Assertions.assertEquals('o', result.get());
    }
}
