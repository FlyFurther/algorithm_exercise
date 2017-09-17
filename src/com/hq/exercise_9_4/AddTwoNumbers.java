package com.hq.exercise_9_4;

/**
 * Created by hq on 17/9/4.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean isCarry = false;
        int val1 = 0, val2 = 0;
        int newWal = 0;
        ListNode headNode = new ListNode(0);
        ListNode temNode = headNode;
        while (l1 != null || l2!= null) {
            if (l1 != null) {
                val1 = l1.val;
            }
            if (l2 != null) {
                val2 = l2.val;
            }
            int sum = 0;
            if (isCarry) {
                sum = val1 + val2 + 1;
                isCarry = false;
            } else {
                sum = val1 + val2;
            }
            if (sum >= 10) {
                newWal = sum%10;
                isCarry = true;
            }
            ListNode newNode = new ListNode(newWal);
            headNode.next = newNode;
            headNode = headNode.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        return temNode.next;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            if (val > 0 && val < 10) {
                this.val = val;
            } else {
                this.val = 0;
            }
        }
    }
}
