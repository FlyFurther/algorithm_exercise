package com.hq.exercise_8_28;

/**
 * Created by hq on 17/8/28.
 */
public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
    }

    public static Boolean repeatedSubstringPattern(String str) {
        int length = str.length();
        if (length <= 1) {
            return false;
        }
        String subStr = "";
        for (int i = 1; i <= length/2; i++) {
            if (length % i != 0) {
                continue;
            }
            subStr = str.substring(i) + str.substring(0, i);
            if (subStr.equals(str)) {
                return true;
            }
//            if (str.matches("^("+sb.toString() + "){2,}")) {
//                int index = 0;
//                for (int i = 0; i < length; i+= sb.length()) {
//                    index = str.indexOf(sb.toString(), index);
//                    count++;
//                }
//                break;
//            }
        }
        return false;
//        if (count > 0) {
//            System.out.println("It's the substring '" + sb.toString() + "' " + count + " times");
//            for (int i = 2; i <= count / 2; i++) {
//                if ((count % i == 0)) {
//                    System.out.println("And the substring '" + str.substring(0, sb.length() * i) + "' " + count / i + "times");
//                }
//            }
//        }
//        return count > 0 ? true : false;
    }
}
