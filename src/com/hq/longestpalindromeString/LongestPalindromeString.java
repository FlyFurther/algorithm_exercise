package com.hq.longestpalindromeString;

/**
 * Created by hq on 20/11/10.
 */
public class LongestPalindromeString {

    public static void main(String[] args) {
        System.out.println(solution("cbbd"));
    }

    private static String solution(String str) {
        String maxPalindromic = "";
        StringBuilder nowString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char nowChar = str.charAt(i);
            if (nowString.length() == 0) {
                nowString.append(nowChar);
                maxPalindromic = nowString.toString();
                continue;
            }
            int charIndex;
            int fromIndex = 0;
            while ((charIndex = nowString.toString().indexOf(nowChar, fromIndex)) >= 0) {
                fromIndex = charIndex + 1;
                String temString = nowString.substring(charIndex);
                temString = temString + nowChar;
                if (isPalindromicString(temString)) {
                    maxPalindromic = temString.length() > maxPalindromic.length()
                            ? temString : maxPalindromic;
                }
            }
            nowString.append(nowChar);
        }
        return maxPalindromic;
    }

    private static boolean isPalindromicString(String str) {
        if(str.length() == 1) {
            return true;
        }
        for(int i = 0; i < str.length() / 2; i++) {
            boolean isPalindromic = str.charAt(i) == str.charAt(str.length() - i - 1);
            if(!isPalindromic) {
                return false;
            }
        }
        return true;
    }
}
