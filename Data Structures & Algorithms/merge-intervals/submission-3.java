
class Solution {
    public int[][] merge(int[][] intervals) {
        // sort it based on the first element in each array
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        boolean[] visited = new boolean[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            if (!visited[i]) {
                int[] ele = new int[2];
                ele[0] = intervals[i][0];
                ele[1] = intervals[i][1];
                // keep merging with next intervals
                while (i + 1 < intervals.length &&
                       intervals[i + 1][0] <= ele[1]) {
                    ele[1] = Math.max(ele[1], intervals[i + 1][1]);
                    visited[i + 1] = true;
                    i++;
                }

                visited[i] = true;
                result.add(ele);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}