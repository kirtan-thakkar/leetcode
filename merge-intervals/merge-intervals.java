import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start1 = intervals[0][0];
        int end1 = intervals[0][1];

        List<int[]> res = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            if (end1 >= start2) { // overlap
                start1=start1;
                end1 = Math.max(end1, end2);
            } else { // no overlap
                res.add(new int[]{start1, end1});
                start1 = start2;
                end1 = end2;
            }
        }

        // add the last merged interval 
        // do not forget to add the last start and end to the merged interval 
        res.add(new int[]{start1, end1});
        return res.toArray(new int[res.size()][]);
    }
}