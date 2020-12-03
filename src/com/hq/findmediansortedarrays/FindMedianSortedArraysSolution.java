package com.hq.findmediansortedarrays;

/**
 * Created by hq on 20/11/9.
 */
public class FindMedianSortedArraysSolution {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        System.out.println(solution(nums1, nums2));
    }
    private static double solution(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        }
        int lengthSum = nums1.length + nums2.length;
        if (lengthSum == 1) {
            return nums1.length > 0 ? nums1[0] : nums2[0];
        }
        int medianOne;
        int medianTwo = 0;
        if (lengthSum % 2 == 0) {
            medianOne = lengthSum / 2;
            medianTwo = lengthSum / 2 + 1;
        } else {
            medianOne = lengthSum / 2 + 1;
        }
        int length = Math.max(medianOne, medianTwo);
        int[] nums = new int[length];
        int index1 = 0;
        int index2 = 0;
        int i = 0;
        for (; i < length; i++) {
            if (index1 < nums1.length && index2 < nums2.length) {
                nums[i] = nums1[index1] > nums2[index2] ?
                        nums2[index2++] : nums1[index1++];
                continue;
            }
            for (int j = i; j < length; j++) {
                nums[j] = index1 >= nums1.length ?
                        nums2[index2++] : nums1[index1++];
            }
            break;
        }

        return lengthSum % 2 == 0 ?
                (nums[medianOne - 1] + nums[medianTwo - 1]) / 2.0f
                : nums[medianOne - 1];
    }
}
