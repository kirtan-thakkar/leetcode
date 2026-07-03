class Solution {
    public int kthSmallest(int[] arr, int k) {
         PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a); // max heap
         for(int i=0;i<k;i++){
            maxHeap.add(arr[i]);
         }
         
         for(int i=k;i<arr.length;i++){
             if(arr[i] < maxHeap.peek()){ // greater toh use less
                 maxHeap.poll();
                 maxHeap.add(arr[i]);
             }
         }
         return maxHeap.peek();
        
    }
}
