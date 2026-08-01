class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {

        //used maxheap cause it is mention in the question that we need the closet points so it better to eliminate the points that are not close with optimal sol
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> {
            if (a.second != b.second) {
                return b.second - a.second;
            }
            return b.first - a.first;
        });

        for (int i = 0; i < points.length; i++) {

            int x = points[i][0];
            int y = points[i][1];

            int distance = x * x + y * y;

            maxHeap.add(new Pair(i, distance));

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] ans = new int[k][2];
        int index = 0;

        while (!maxHeap.isEmpty()) {
            Pair p = maxHeap.poll();

            ans[index][0] = points[p.first][0];
            ans[index][1] = points[p.first][1];

            index++;
        }

        return ans;
    }
}