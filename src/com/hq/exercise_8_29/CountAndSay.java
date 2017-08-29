package com.hq.exercise_8_29;

/**
 * Created by hq on 17/8/29.
 */
public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        int count = 0;
        char[] chars = null;
        String str = "1";
        for (int i = 1; i < n; i++) {
            if (i == 1) {
                str = "11";
                continue;
            }
            chars = str.toCharArray();
            str = "";
            char ch = chars[0];
            int j = 0, length = chars.length;
            for (; j < length; j++) {
                if (ch == chars[j]) {
                    count++;
                } else {
                    str = str + count + ch;
                    ch = chars[j];
                    count = 1;
                }
            }
            if (j >= length) {
                str = str + count + "" + ch;
                count = 0;
            }
        }

        return str;
    }
}
