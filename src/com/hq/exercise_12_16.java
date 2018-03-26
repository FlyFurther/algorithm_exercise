package com.hq;

/**
 * Created by hq on 17/12/16.
 */
public class exercise_12_16 {

    public static void main(String[] args) {
        int[][] mat = new int[11][11];
        int n = 10, m = 10;
        int[] dp = new int[11];
        int i, j;
        //朴素DP
        for(i = 1; i <= 10; ++i){
            mat[1][i] = mat[i][1] = 1;
        }

        for(i = 2; i <= 10; ++i){
            for(j = 2; j <= 10; ++j){
                mat[i][j] = mat[i-1][j] + mat[i][j - 1];
            }
        }
        for(i = 2; i <= 10; ++i){
            for(j = 2; j <= 10; ++j){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        for(i = 1; i <= n; ++i){
            dp[i] = 1;
        }
        for(i = 2; i <= m; ++i){
            for(j = 2; j <= n; ++j){
                dp[j] += dp[j - 1];
            }
        }
        for(i = 1; i <= n; ++i){
            System.out.print(dp[i] + " ");
        }
    }
}
