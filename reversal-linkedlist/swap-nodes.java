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
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode left = head;
        ListNode res = head.next; // new head after first swap
        ListNode prevLeft = null;

        while (left != null && left.next != null) {
            ListNode right = left.next;
            ListNode nextLeft = right.next;

            // swap
            right.next = left;
            left.next = nextLeft;

            // connect previous pair
            if (prevLeft != null) {
                prevLeft.next = right;
            }

            prevLeft = left;
            left = nextLeft;
        }

        return res;
    }
}