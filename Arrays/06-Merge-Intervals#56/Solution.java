import java.util.*;

class Solution {

    public int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals based on starting value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Store merged intervals
        List<int[]> result = new ArrayList<>();

        // Step 3: Start with first interval
        int[] current = intervals[0];

        // Step 4: Traverse remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            // Overlap condition
            if (intervals[i][0] <= current[1]) {

                // Merge intervals
                current[1] = Math.max(current[1], intervals[i][1]);

            } else {

                // No overlap
                result.add(current);

                // Move to next interval
                current = intervals[i];
            }
        }

        // Add last interval
        result.add(current);

        // Convert ArrayList to 2D Array
        return result.toArray(new int[result.size()][]);
    }
}