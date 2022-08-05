package com.sparta.kx;

public class Palindrome {
    public static void main(String[] args) {
        String s = "ABCDE";
        String sentence = "I drifted around in my kayak to do a good deed";

        System.out.println(reverse(s));
        System.out.println("The largest palindrome in the sentence " + sentence + " + " + findBiggestPalindrome(sentence));
        //System.out.println(("The palindromes in the sentence: " + sentence + "are:\n" + findAllSentencePalindrome(sentence)));



    }
    static String reverse(String word) {
        String temp = "";
        for (int i = word.length()-1; i >= 0; i--) {
            temp += word.charAt(i);
        }
        //System.out.println(temp);
        return temp;
    }
    static boolean isPalindrome(String word){
        if (word.toLowerCase().equals(reverse(word.toLowerCase()))){
            return true;
        } else {
            return false;
        }
    }

    static String findBiggestPalindrome(String word) {
        String[] splitSentence = word.split(" ");
        String biggestPalindrome = "";
        for(String s : splitSentence) {
            if ((isPalindrome(s))) {
                if (s.length() > biggestPalindrome.length()) {
                    biggestPalindrome = s;
                }
            }
        }
        return biggestPalindrome;
    }
 /*   static String findAllSentencePalindrome(String word) {
        String[] splitSentence = word.split(" ");
        StringBuilder palindromeWords = new StringBuilder();

        for(String s : splitSentence) {
            if (isPalindrome(s)){
                palindromeWords.append(s).append(" ");
            }
        }
        String[] slicedSort = {};
        return palindromeWords.toString();
    }
  */
}