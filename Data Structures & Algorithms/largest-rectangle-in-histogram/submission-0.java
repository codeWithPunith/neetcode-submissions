class Solution {
    public int largestRectangleArea(int[] heights) {
    Stack<int[]> stack = new Stack<>();
    int maxArea =0;
    int n = heights.length;
    for(int i=0; i<n;i++){
        int start=i;
        while (!stack.isEmpty()&& stack.peek()[1]>heights[i]){
          int[] pair=stack.pop();
          int index = pair[0];
          int height = pair[1];
          maxArea = Math.max(maxArea , height*(i-index));
          start = index;
        }
        stack.push(new int[]{start ,heights[i]});
    }
        
        for (int[] pair : stack) {
            int index = pair[0];
            int height = pair[1];
            maxArea = Math.max(maxArea, height * (heights.length - index));
        }
        return maxArea;
    }
}
