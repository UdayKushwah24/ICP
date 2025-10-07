package InfinityChampionsProgram.Day9;

public class PalindromeLL_234 {
    
    public class ListNode {
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

    public ListNode Reverse(ListNode node) {
        ListNode curr = node;
        ListNode prev = null;
        while (curr != null) {
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }

    public ListNode middleNode(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode mid = middleNode(head);
        ListNode secondHalfStart = mid.next;
        mid.next = null;

        ListNode rev = Reverse(secondHalfStart);
        ListNode first = head;

        while (first != null && rev != null) {
            // System.out.println(first.data + " " + rev.data);
            if (first.val != rev.val)
                return false;
            first = first.next;
            rev = rev.next;
        }

        return true;
    }

}