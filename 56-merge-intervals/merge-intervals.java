import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Sort intervals based on starting time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> merged = new ArrayList<>();

        // Add the first interval
        merged.add(intervals[0]);

        // Traverse remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            int[] last = merged.get(merged.size() - 1);

            // If intervals overlap, merge them
            if (intervals[i][0] <= last[1]) {
                last[1] = Math.max(last[1], intervals[i][1]);
            }
            // Otherwise, add as a new interval
            else {
                merged.add(intervals[i]);
            }
        }

        // Convert ArrayList to int[][]
        return merged.toArray(new int[merged.size()][]);
    }
}