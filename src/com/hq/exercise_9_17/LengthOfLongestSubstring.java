package com.hq.exercise_9_17;

/**
 * Created by hq on 17/9/17.
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {

    }

    public static int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        String maxStr = "";
        StringBuffer subStr = new StringBuffer();
        for (int i = 0, length = charArray.length; i < length; i++) {
            int index = subStr.toString().indexOf(charArray[i]);
            if (index >= 0) {
                subStr = subStr.delete(0, index+1);
            } else {
                subStr.append(charArray[i]);
            }
            if (subStr.length() > maxStr.length()) {
                maxStr = subStr.toString();
            }
        }
        return maxStr.length();
    }
}
