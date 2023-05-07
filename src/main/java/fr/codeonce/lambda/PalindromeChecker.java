package fr.codeonce.lambda;

import java.util.stream.IntStream;

public class PalindromeChecker {
    public boolean isPalindrome(String text) {
        String normalizedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return IntStream.range(0, normalizedText.length() / 2)
                        .allMatch(i -> normalizedText.charAt(i) == normalizedText.charAt(normalizedText.length() - i - 1));
    }
}
