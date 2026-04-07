class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = 0, second = 0;
        List<Integer> list = new ArrayList<>();

    
        while (first < m || second < n) {

            if (second >= n || (first < m && nums1[first] <= nums2[second])) {
                list.add(nums1[first++]);
            } else {
                list.add(nums2[second++]);
            }
        }

        for (int i = 0; i < m + n; i++) { 
            nums1[i] = list.get(i);
        }
    }
}