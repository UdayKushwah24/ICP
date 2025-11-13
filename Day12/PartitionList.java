package InfinityChampionsProgram.Day12;

import java.util.*;

public class PartitionList {

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

    public ListNode partition(ListNode head, int x) {
        ListNode smallList = new ListNode(0);
        ListNode biglist = new ListNode(0);
        ListNode small = smallList;
        ListNode big = biglist;
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                big.next = head;
                big = big.next;
            }
            head = head.next;
        }
        small.next = biglist.next;
        big.next = null;
        return smallList.next;
    }
}
