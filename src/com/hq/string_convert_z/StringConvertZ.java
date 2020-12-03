package com.hq.string_convert_z;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hq on 20/11/11.
 */
public class StringConvertZ {

    public static void main(String[] args) {
        System.out.println(solution("LEETCODEISHIRING", 3));
    }
    public static String solution(String s, int numRows) {
        char[][] charArray = new char[numRows][];
        StringBuilder result = new StringBuilder();
        int indexX = 0;
        int indexY = 0;
        Set<Character> numCharSet = new HashSet<>();
        Set<Character> symbolSet = new HashSet<>();
        Set<Character> a = new HashSet<>('a', 'b');
        for (int i = 0; i < s.length(); i++) {
            if (indexX <= numRows -1) {
                charArray[indexX++][indexY] = s.charAt(i);
                continue;
            }
            if (indexY <= numRows -1) {
                charArray[--indexX][++indexY] = s.charAt(i);
            }
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < indexY; j++) {
                if (charArray[i][j] != 0) {
                    result.append(charArray[i][j]);
                }
            }
        }
        return result.toString();
    }
}
