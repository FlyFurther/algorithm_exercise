package com.hq.addtwonumbers;

/**
 * Created by hq on 20/11/4.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbersSolution {
    public static void main(String[] args) {
        AddTwoNumbersSolution solution = new AddTwoNumbersSolution();
        ListNode l1 = new ListNode(1, new ListNode(6, new ListNode(0, new ListNode(3, new ListNode(3, new ListNode(6))))));
        ListNode l2 = new ListNode(6, new ListNode(3, new ListNode(0, new ListNode(8, new ListNode(9)))));
        ListNode l3 = solution.addTwoNumbers(l1, l2);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = l1;
        int decade = 0;
        while (true) {
            int temVal = l1.val + l2.val + decade;
            decade = temVal / 10;
            l1.val = temVal % 10;
            if (l1.next == null && l2.next == null && decade == 0) {
                break;
            }
            if (l1.next == null) {
                l1.next = new ListNode(0);
            }
            if (l2.next == null) {
                l2.next = new ListNode(0);
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return result;
    }

   static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
