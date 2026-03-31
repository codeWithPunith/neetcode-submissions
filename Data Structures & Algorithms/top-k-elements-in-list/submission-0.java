class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        // Initialize the freq array with empty lists
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        // Count the frequency of each number in nums
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // Group numbers by their frequencies
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        // Prepare result array to store the top k frequent elements
        int[] res = new int[k];
        int index = 0;

        // Loop over the freq array to pick the top k frequent elements
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }

        return res;
    }
}
