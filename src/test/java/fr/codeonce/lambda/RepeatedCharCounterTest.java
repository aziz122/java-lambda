package fr.codeonce.lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepeatedCharCounterTest {
    @Test
    public void testCountOccurrences() {
        String text = "Java is a programming language that is popular in the software industry.";
        String word = "language";
        
        int count = RepeatedCharCounter.countOccurrences(text, word);
        Assertions.assertEquals(1, count);
    }
}
