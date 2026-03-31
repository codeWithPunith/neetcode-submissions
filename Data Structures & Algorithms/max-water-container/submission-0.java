class Solution {
    public int maxArea(int[] heights) {
        int max =0;
        int l=0, r=heights.length-1;
        while(l<r){
           if((minlength(heights[l],heights[r])*(r-l))>max) {
            max =minlength(heights[l],heights[r])*(r-l);         
           }
            if(minlength(heights[l],heights[r])==heights[l]) l++;
            else r--;
        }
        return max;
    }
    public int minlength(int a,int b){
        if (a>b) return b;
        else return a;
    }
}
