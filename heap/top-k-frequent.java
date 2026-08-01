class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> h1 = new HashMap<>();

        for(int num : nums){
            h1.put(num , h1.getOrDefault(num,0)+1);
        }

        //minHeap is used cause that is more optimal by eliminating the elements that does not fit in the top k criteria
        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a,b)->{
            if(a.second!=b.second){
                return a.second - b.second;
            }
            return a.first - b.first;
        });
        
        //heap insertion

        for(Map.Entry<Integer,Integer> entry : h1.entrySet()){
            
            int value = entry.getKey();
            int metric = entry.getValue();
            minHeap.add(new Pair(value,metric));

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        //amswer
        int[] ans = new int[k];
        int index = 0;

        while(!minHeap.isEmpty()){
            ans[index++] = minHeap.poll().first;
        }

        return ans;


    }
}
// time complexitcty would O(n+mlogn)
// frequency map would take O(n) time and processing the heap would take O(mlogn) time

// revised heap 

// template says that whenever there is any term used like kth biggest/largest -> min heap use thase to improve time complexity and whenever there is term like smallest/min then always max heap will be used!