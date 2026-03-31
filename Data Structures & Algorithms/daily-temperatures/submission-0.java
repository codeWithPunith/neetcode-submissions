class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
           int[] res = new int[temperatures.length];
        int n = temperatures.length;
        for (int i =0;i<n;i++){
            int t = temperatures[i];
            while(!stack.isEmpty() && t > stack.peek()[0]){
                int[] pair = stack.pop();
                res[pair[1]] =i-pair[1];
            }
             stack.push(new int[]{t, i});
        }
        return res;
    }
}
