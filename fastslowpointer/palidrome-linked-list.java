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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;


        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        ListNode prev = null;

        while(mid!=null){
            ListNode next = mid.next;
            mid.next = prev;
            prev=mid;
            mid=next;
        }

        ListNode head1 =head;
        ListNode head2 =prev;

        while(head2!=null){
            if(head1.val != head2.val){
                return false;
            }
            head1 = head1.next;
            head2=head2.next;
        }
        return true;
    }
}