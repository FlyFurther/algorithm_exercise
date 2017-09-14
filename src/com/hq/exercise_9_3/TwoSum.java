package com.hq.exercise_9_3;

/**
 * Created by hq on 17/9/3.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{1, 2, 0, 8, 4, 5, 3, 10, 9}, 7);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
         for (int i = 0, length = nums.length; i < length; i++) {
             int result = target - nums[i];
             for (int j = i + 1; j < length; j++) {
                 if (nums[j] == result) {
                     results[0] = nums[i];
                     results[1] = nums[j];
                 }
             }
         }
        return results;
    }
}
