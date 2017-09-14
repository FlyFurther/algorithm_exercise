package com.hq.exercise_9_4;

/**
 * Created by hq on 17/9/4.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean isCarry = false;
        while (l1 != null || l2!= null) {
            if (l1 == null) {
                l1.val = l1.val + l2.val;
                if (isCarry) {
                    l1.val += 1;
                    isCarry = false;
                }
                if (l1.val / 10 > 0) {
                    isCarry = true;
                    l1.val %= 10;
                }
            } else if (l2 == null) {

            }
        }
        return null;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            if (val > 0 && val < 10) {
                this.val = val;
            }
        }
    }
}
