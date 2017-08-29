package com.hq.exercise_8_20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by hq on 17/8/20.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("llrr"));
    }

    public static boolean solution(String moves) {
        //设置坐标系,初始化位置为0,0; 右为x正轴,上为y正轴
        int[] position = new int[]{0,0};
        //将字符转为大写
        moves = moves.toUpperCase();
        char[] move = moves.toCharArray();
        for (int i = 0, length = move.length; i < length; i++) {
            switch (move[i]) {
                case 'R' : position[0]++; break;
                case 'L' : position[0]--; break;
                case 'U' : position[1]++; break;
                case 'D' : position[1]--; break;
                default: break;
            }
        }
        int sum = 0;
        for (int i = 0, length = position.length; i < length-1; i++) {
            sum = position[i] + position[i+1];
        }
        return sum == 0 ? true : false;
    }
}
