package com.hq.exercise_9_19;

import sun.misc.BASE64Decoder;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by hq on 18/3/12.
 */

class Human{
}
class Man extends Human{
}
class Woman extends Human{
}

public class Test{

    public void say(Human hum){
        System.out.println("I am human");
    }
    public void say(Man hum){
        System.out.println("I am man");
    }
    public void say(Woman hum){
        System.out.println("I am woman");
    }
    public static void main(String[] args){
//        Human man = new Man();
//        Human woman = new Woman();
//        Test sp = new Test();
//        sp.say(man);
//        sp.say(woman);


//        String dateStr = "Thu Mar 15 2018 15:22:45";
//        SimpleDateFormat sdf1 = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss", Locale.US);
//        try {
//            Date date1 = sdf1.parse(dateStr);
//            System.out.println(date1);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(new Date().getTime());
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date testDate = new Date();
//        System.out.println(testDate.getTime() + "-->" + sdf.format(testDate));
//        testDate.setTime(testDate.getTime() + 10000000);
//        System.out.println(testDate.getTime() + "-->" + sdf.format(testDate));
//        boolean b = testDate.before(new Date());
//        System.out.println(b);

//        BASE64Decoder base64Decoder = new BASE64Decoder();
//        try {
//            System.out.println(String.valueOf(base64Decoder.decodeBuffer("eyJpbWVpU2hhMiI6IjEyMzQ1Njc4In0=")));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        char[] arr = new char[3];
//        arr[1] = 'a';
        System.out.println("--"+arr[1]+"--");

    }


    public void test(int[] arr) {

    }

}


