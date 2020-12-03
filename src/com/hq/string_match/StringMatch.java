package com.hq.string_match;

/**
 * Created by hq on 20/11/15.
 */
public class StringMatch {
    private static final char WILDCARD = '.';
    public static void main(String[] args) {
//        System.out.println(solution("mississippi", "mis*is*p*."));
        System.out.println(solution("aaa", "ab*a*c*a"));

    }
    public static boolean solution(String s, String p) {
        int sLength = s.length();
        int pLength = p.length();
        boolean[][] IS_MATCH = new boolean[sLength + 1][pLength + 1];
        IS_MATCH[0][0] = true;
        for(int i = 1; i < sLength; i++) {
            IS_MATCH[i][0] = false;
        }
        for(int j = 1; j < pLength + 1; j++) {
            if (p.charAt(j - 1) == '*') {
                IS_MATCH[0][j] = IS_MATCH[0][j - 2];
            }
        }
        for(int i = 1; i < sLength + 1; i++) {
            for(int j = 1; j < pLength + 1; j++) {
                char sChar = s.charAt(i - 1);
                char pChar = p.charAt(j - 1);
                if(pChar == '*') {
                    IS_MATCH[i][j] = IS_MATCH[i][j-2];
                    if(match(sChar, p.charAt(j - 2))) {
                        IS_MATCH[i][j] = IS_MATCH[i - 1][j];
                    }
                } else {
                    if(match(sChar, pChar)) {
                        IS_MATCH[i][j] = IS_MATCH[i - 1][j - 1];
                    }
                }
            }
        }
        return IS_MATCH[sLength][pLength];
    }

    private static boolean match(char sChar, int pChar) {
        if(pChar == '.') {
            return true;
        }
        return sChar == pChar;
    }
}
