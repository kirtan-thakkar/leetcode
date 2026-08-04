class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {

        ArrayList<Integer> ans = new ArrayList<>();

        int n = mat.length;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]
        );

        // {value, row, col}
        for (int i = 0; i < n; i++) {
            minHeap.offer(new int[]{mat[i][0], i, 0});
        }

        while (!minHeap.isEmpty()) {

            int[] curr = minHeap.poll();

            int value = curr[0];
            int row = curr[1];
            int col = curr[2];

            ans.add(value);

            if (col + 1 < mat[row].length) {
                minHeap.offer(new int[]{
                    mat[row][col + 1],
                    row,
                    col + 1
                });
            }
        }

        return ans;
    }
}