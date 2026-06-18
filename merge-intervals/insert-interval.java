class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        if (intervals.length == 0) {
            return new int[][] { newInterval };
        }

        int start1 = intervals[0][0];
        int end1 = intervals[0][1];

        int[][] finalInterval = new int[intervals.length + 1][2];

        for (int i = 0; i < intervals.length; i++) {
            finalInterval[i] = intervals[i];
        }

        finalInterval[intervals.length] = newInterval;

        Arrays.sort(finalInterval, (a, b) -> a[0] - b[0]);

        start1 = finalInterval[0][0];
        end1 = finalInterval[0][1];

        List<int[]> res = new ArrayList<>();

        for (int i = 1; i < finalInterval.length; i++) {
            int start2 = finalInterval[i][0];
            int end2 = finalInterval[i][1];

            if (end1 >= start2) {
                end1 = Math.max(end1, end2);
            } else {
                res.add(new int[]{start1, end1});
                start1 = start2;
                end1 = end2;
            }
        }

        res.add(new int[]{start1, end1});

        return res.toArray(new int[res.size()][]);
    }
}