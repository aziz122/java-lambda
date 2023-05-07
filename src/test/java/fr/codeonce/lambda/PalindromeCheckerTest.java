package fr.codeonce.lambda;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {
    @Test
    public void testIsPalindrome() {
        PalindromeChecker pc = new PalindromeChecker();
        assertTrue(pc.isPalindrome("aba"));
        assertTrue(pc.isPalindrome("rtr"));
        assertFalse(pc.isPalindrome("abc"));
    }
}
