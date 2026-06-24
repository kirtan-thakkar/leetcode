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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        ListNode left = head;
        ListNode prevLeft = null;
        ListNode res = head;
        boolean firstGroup = true;

        while (left != null) {

            // Find kth node
            ListNode right = left;
            for (int i = 1; i < k; i++) {
                if (right == null) break;
                right = right.next;
            }

            // Less than k nodes remain
            if (right == null) {
                break;
            }

            ListNode nextLeft = right.next;

            // Reverse k nodes
            ListNode prev = nextLeft;
            ListNode curr = left;

            while (curr != nextLeft) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // Connect previous group
            if (prevLeft != null) {
                prevLeft.next = right;
            }

            // Update result after first reversal
            if (firstGroup) {
                res = right;
                firstGroup = false;
            }

            prevLeft = left;   // old left is now tail
            left = nextLeft;   // move to next group
        }

        return res;
    }
}