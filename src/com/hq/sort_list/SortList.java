package com.hq.sort_list;

/**
 * Created by hq on 20/11/22.
 */
public class SortList {

    public static void main(String[] args) {
        System.out.println(solution(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))));
    }

    public static ListNode solution(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode fastNode = head.next.next;
        ListNode slowNode = head;
        while(fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        ListNode midNode = slowNode.next;
        slowNode.next = null;
        head = solution(head);
        midNode = solution(midNode);
        return merge(head, midNode);
    }

    public static ListNode merge(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode sentinel = null;
        if(l1.val > l2.val) {
            sentinel = l2;
            l2 = l2.next;
        } else {
            sentinel = l1;
            l1 = l1.next;
        }
        sentinel.next = null;
        ListNode head = sentinel;
        while(l1 != null && l2 != null) {
            if(l1.val > l2.val) {
                sentinel.next = l2;
                l2 = l2.next;
            } else {
                sentinel.next = l1;
                l1 = l1.next;
            }
            sentinel = sentinel.next;
        }
        ListNode longList = l1 == null ? l2 : l1;
        while(longList != null) {
            sentinel.next = longList;
            longList = longList.next;
            sentinel = sentinel.next;
        }
        return head;
    }

    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
