package com.hq.exercise_9_18;

import java.util.Arrays;

/**
 * Created by hq on 17/9/18.
 */
public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        findMedianSortedArrays(nums1, nums2);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int index1 = 0;
        int index2 = 0;
        int[] tarArr = new int[length1+length2];
        int length = tarArr.length;
        for (int i = 0; i < length; i++) {
            int value = 0;
            if (index1 < length1 && index2 < length2) {
                value = nums1[index1] > nums2[index2] ? nums2[index2++] : nums1[index1++];
                tarArr[i] = value;
            } else if (index1 >= length1) {
                value = nums2[index2++];
            } else {
                value = nums1[index1++];
            }
            tarArr[i] = value;
        }
        return  length % 2 == 0 ? (tarArr[length/2] + tarArr[length/2 - 1])/2.0 : tarArr[length/2];
    }
}
