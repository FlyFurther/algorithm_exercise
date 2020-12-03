package com.hq.LongestSubString;

/**
 * Created by hq on 20/11/8.
 */
public class LongestSubStringSolution {

    public static void main(String[] args) {
        System.out.println(solution("dvdf"));
    }

    private static int solution(String s) {
        int maxLength = 0;
        StringBuilder nowSubString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char nowChar = s.charAt(i);
            int charIndex = nowSubString.toString().indexOf(nowChar);
            if (charIndex >= 0) {
                nowSubString = new StringBuilder(nowSubString.substring(charIndex + 1));
            }
            nowSubString.append(nowChar);
            maxLength = Math.max(maxLength, nowSubString.length());
        }
        return maxLength;
    }
}
