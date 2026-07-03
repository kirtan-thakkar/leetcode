public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // min heap
        for (int i = 0; i < k; i++) {
            minHeap.add(nums[i]);
        }
        
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) { // if less then its of no use
                minHeap.poll(); //udai ne tare add karvanu
                minHeap.add(nums[i]);
            }
        }
        
        return minHeap.peek(); // return minimum
    }
}