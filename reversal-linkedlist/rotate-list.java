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
    public ListNode rotateRight(ListNode head, int k) {
        // Base case: if list is empty or has only 1 node, no rotation needed
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        ListNode last = head;
        int n = 1; // head null nathi that means atleast 1 node toh che
        while (last.next != null) {
            n++;
            last = last.next;
        }
        
        //cases where k >= n using modulo
        k = k % n;
        if (k == 0) {
            return head; // No rotation needed if k is a multiple of n
        }
        
        // Connect the last node to the head to form a cycle
        last.next = head;

        // now find the n-kth node and the n-k+1 node that would the new head of the linkedlist
        int c = n - k;
        ListNode nminuskNode = head;
        int count = 1;
        while (nminuskNode != null) { // a way to find any nth node
            if (count == c) {
                break;
            }
            count++;
            nminuskNode = nminuskNode.next;
        } // found the n-kth node 
        
        ListNode res = nminuskNode.next; // new head;
        nminuskNode.next = null; // break the cycle

        return res;
    }
}
