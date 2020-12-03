package com.hq.find_min_arrow_shots;

import java.util.Arrays;

/**
 * Created by hq on 20/12/2.
 */
public class FindMinArrowShots {

    public static void main(String[] args) {
        int[][] a = new int[][]{{10,16},{2,8},{1,6},{7,12}};
        solution(a);
    }

    public static int solution(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (o1, o2) -> o1[1] > o2[1] ? 1 : -1);
        int shots = 1;
        int xIndex = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (xIndex < points[i][0]) {
                xIndex = points[i][1];
                shots++;
            }
        }
        return shots;
    }
}
