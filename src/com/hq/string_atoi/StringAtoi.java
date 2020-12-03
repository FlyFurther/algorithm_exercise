package com.hq.string_atoi;

/**
 * Created by hq on 20/11/13.
 */
public class StringAtoi {

    public static void main(String[] args) {
        System.out.println(solution("+-12"));
    }
    public static int solution(String s) {
        int symbol = 1;
        long result = 0;
        char firstValidChar = '\u0000';
        for(int i = 0; i < s.length(); i++) {
            char nowChar = s.charAt(i);
            if(nowChar == ' ') {
                continue;
            }
            if(firstValidChar == '\u0000' && ('-' == nowChar || nowChar == '+')) {
                symbol = nowChar == '-' ? -1 : 1;
                firstValidChar = nowChar;
                continue;
            }
            if('0' <= nowChar && nowChar <= '9') {
                result = result * 10 + (nowChar - '0');
                continue;
            }
            break;
        }
        result *= symbol;
        return result > Integer.MAX_VALUE ? Integer.MAX_VALUE : result < Integer.MIN_VALUE ?
                Integer.MIN_VALUE : ((int) result);
    }
}
