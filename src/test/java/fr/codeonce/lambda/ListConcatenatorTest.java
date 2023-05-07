package fr.codeonce.lambda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ListConcatenatorTest {
    @Test
    public void testConcat() {
        List<String> l1 = Arrays.asList("a", "z", "e");
        List<Integer> l2 = Arrays.asList(1, 2, 3);
        ListConcatenator lc = new ListConcatenator();
        List<String> result = lc.concat(l1, l2);
        assertEquals(Arrays.asList("a", "z", "e", "1", "2", "3"), result);
    }
}
