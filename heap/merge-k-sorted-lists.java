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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)-> a.val - b.val);

        for(ListNode node : lists){
            if(node!=null) {
                minHeap.add(node);
            }
        }

        ListNode dummy = new ListNode();
        ListNode res = dummy;

        while(!minHeap.isEmpty()){
            ListNode curr = minHeap.poll();
            res.next = curr ; 
            res = res.next;

             // If there's a next node in the same list, add it to heap
            if(curr.next != null){
                minHeap.offer(curr.next);
            }
        }
        return dummy.next;
    }
}