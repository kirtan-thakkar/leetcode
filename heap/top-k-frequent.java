class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> minHeap =
                new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));

        int[] ans = new int[k];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.add(new int[]{entry.getKey(), entry.getValue()});

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int index = 0;

        while (!minHeap.isEmpty()) {
            ans[index++] = minHeap.poll()[0];
        }

        return ans;
    }
}

// time complexitcty would O(n+mlogn)
// frequency map would take O(n) time and processing the heap would take O(mlogn) time