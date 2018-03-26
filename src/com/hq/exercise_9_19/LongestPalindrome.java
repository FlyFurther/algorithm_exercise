package com.hq.exercise_9_19;

import sun.misc.BASE64Decoder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by hq on 17/9/19.
 */
public class LongestPalindrome {

    private static String hexString = "0123456789ABCDEF";

    public static void main(String[] args) {
        String str = "0022 0000 0000 c0ff 0000 0000 0000 0000" +
                "c749 0000 0002 0000 0090 0100 7d7c 7b7a" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000" +
                "0000 0000 0000 0000 0000 0000 0000 0000";
        str = str.replaceAll("\\s", "");
        str = str.toUpperCase();
        System.out.println(hexStringToString(str));
    }
    public static String longestPalindrome(String s) {


        return "";
    }

    public static String decode(String bytes) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(bytes.length());
        // 将每2位16进制整数组装成一个字节
        for (int i = 0; i < bytes.length() - 1; i += 2)
            baos.write((hexString.indexOf(bytes.charAt(i)) << 4 | hexString
                    .indexOf(bytes.charAt(i + 1))));
        return new String(baos.toByteArray());
    }

    public static String toStringHex(String s)
    {
        byte[] baKeyword = new byte[s.length()/4];
        for(int i = 0; i < baKeyword.length; i++)
        {
            try
            {
                baKeyword[i] = (byte)(0xff & Integer.parseInt(s.substring(i*2, i*2+2),16));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        try
        {
            s = new String(baKeyword);//UTF-16le:Not
        }
        catch (Exception e1)
        {
            e1.printStackTrace();
        }
        return s;
    }


    public static String hexStringToString(String s) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(s.getBytes().length);
        if (s == null || s.equals("")) {
            return null;
        }
        s = s.replace(" ", "");
        byte[] baKeyword = new byte[s.length() / 2];
        for (int i = 0; i < baKeyword.length; i+=2) {
            try {
                baos.write((Integer.parseInt(s.substring(i, i +1), 16) & 0xf) << 4 | Integer.parseInt(s.substring(i+1, i + 2), 16) & 0xf);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            s = new String(baos.toByteArray(), "gbk");
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return s;
    }

    public static String hexString2binaryString(String hexString)
    {
        if (hexString == null || hexString.length() % 2 != 0)
            return null;
        String bString = "", tmp;
        for (int i = 0; i < hexString.length(); i++)
        {
            tmp = "0000"
                    + Integer.toBinaryString(Integer.parseInt(hexString
                    .substring(i, i + 1), 16));
            bString += tmp.substring(tmp.length() - 4);
        }
        return bString;
    }

    public static String convertHexToString(String hex){

        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        //49204c6f7665204a617661 split into two characters 49, 20, 4c...
        for( int i=0; i<hex.length()/2-1; i+=2 ){

            //grab the hex in pairs
            String output = hex.substring(i*2, (i*2 + 2));
            //convert hex to decimal
            int decimal = Integer.parseInt(output, 16);
            //convert the decimal to character
            sb.append((char)decimal);

            temp.append(decimal);
        }

        return sb.toString();
    }

}
