class Solution {
    public int maxArea(int[] height) {
        int result = Integer.MIN_VALUE;
        System.out.println(result);
        int i =0,j=height.length-1;
        while (i<j){
            
            if(height[i]<height[j]){
                result = Math.max(result , height[i]*(j-i));
                i++;
            }else{
                result = Math.max(result , height[j]*(j-i));
                j--;
            }
        }
        return result;
    }
}