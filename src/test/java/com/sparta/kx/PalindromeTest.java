package com.sparta.kx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    @Test
    void acceptTest(){
        Assertions.assertTrue(Palindrome.isPalindrome("racecar"));
    }

    @Test
    void notPalindrome() {
        Assertions.assertFalse(Palindrome.isPalindrome("Keivi"));
    }

    @Test
    @DisplayName("Test with upper case")
    void upperCase() {
        Assertions.assertTrue(Palindrome.isPalindrome("Abba"));
    }

    @Test
    @DisplayName("Test if input is an empty string")
    void whitespaceString() {
        Assertions.assertTrue(Palindrome.isPalindrome(" "));
    }

    @Test
    @DisplayName("When a sentence is given, return the biggest palindrome")
    void sentenceBiggestPalindromeChecker() {
        String sentence = "in my racecar i will succeed";
        Assertions.assertEquals("racecar",Palindrome.findBiggestPalindrome(sentence));
    }
}
