import java.util.List;
import java.util.Stack;

public class AddTwoNumbers_2 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        int total = 0, reminder = 0;
        while (l1 != null || l2 != null) {
            if(l1 != null && l2 != null) {
                total = l1.val + l2.val+ reminder;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l2 == null && l1 != null) {
                total = l1.val + reminder;
                l1 = l1.next;
            } else if (l1 == null && l2 != null) {
                total = l2.val + reminder;
                l2 = l2.next;
            }

            if(total > 9) {
                reminder = total/10;
                total = total % 10;
            } else {
                reminder = 0;
            }
            ListNode node = new ListNode();
            node.val = total;
            listNode.next = node;
            listNode = listNode.next;

        }
        return  listNode.next;
    }

    static ListNode makeNode(int[] digits) {
        ListNode listNode = new ListNode();
        for (int i=digits.length-1; i >= 0; i--) {
            if(i == (digits.length-1)) {
                listNode.next = null;
                listNode.val = digits[i];
            } else {
                ListNode ln = new ListNode();
                ln.val = digits[i];
                ln.next = listNode;
                listNode = ln;
            }
        }
        return listNode;
    }

    public static void main(String[] args) {
        System.out.println(addTwoNumbers(makeNode(new int[] {2, 4, 3}),makeNode(new int[] {5, 6, 4})));

    }
}
