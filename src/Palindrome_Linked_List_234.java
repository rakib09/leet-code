public class Palindrome_Linked_List_234 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static boolean isPalindrome(ListNode head) {
        StringBuilder numberString = new StringBuilder();
        while(head != null) {
            numberString.append(head.val);
            head = head.next;
        }
        String xs= numberString.toString();
        for(int i=0;i<(xs.length()/2); i++) {
            if(xs.charAt(i) != xs.charAt(xs.length()-i-1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println(isPalindrome(listNode));
    }
}
