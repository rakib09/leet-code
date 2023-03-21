package com.extremecoder.linkedlist;

public class MergeTwoSortedLists_21 {
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        return null;
    }

    public static void main(String[] args) {
        print(populateLinkedList(new int[] {1,2,4}));
        print(populateLinkedList(new int[] {1,3,4}));
    }
    private static ListNode populateLinkedList(int[] list) {
        ListNode head = new ListNode(list[list.length-1]);
        for (int i = list.length -2; i >= 0; i--) {
            head = new ListNode(list[i], head);
        }
        return head;
    }
    private static void print(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
