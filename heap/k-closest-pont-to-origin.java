class Pair {
    int index;
    int distance;

    Pair(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {

        // Max Heap
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> {
            return b.distance - a.distance;
        });

        // Push every point into the heap
        for (int i = 0; i < points.length; i++) {

            int x = points[i][0];
            int y = points[i][1];

            // Squared distance (no need for sqrt)
            int distance = x * x + y * y;

            maxHeap.add(new Pair(i, distance));

            // Keep only k elements
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Prepare answer
        int[][] ans = new int[k][2];
        int index = 0;

        while (!maxHeap.isEmpty()) {
            Pair p = maxHeap.poll();

            ans[index][0] = points[p.index][0];
            ans[index][1] = points[p.index][1];

            index++;
        }

        return ans;
    }
}