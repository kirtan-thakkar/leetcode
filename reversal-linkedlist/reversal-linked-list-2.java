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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || right==left){
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;

        int post =1;
        while(post<left){
            prev = curr;
            curr = curr.next;
            post++;
        }

        ListNode connection = prev;
        ListNode tail = curr;

        //reverse exactly right -left +1 times
        for(int i=0;i < (right-left+1) ;i++){
            ListNode temp = curr.next;
            curr.next=prev;
            prev = curr;
            curr = temp;
        }

        //connect left side
        if(connection!=null){
            connection.next = prev;
        }else{
            head = prev;
        }

        //connect right side
        tail.next = curr;
        
        return head;
    }
}