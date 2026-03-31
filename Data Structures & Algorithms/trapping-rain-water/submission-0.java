class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=1;
        int r= n-2;
        int lmax=height[l-1];
        int rmax=height[r+1];
        int res=0;
        while(l<=r){
            if(lmax<=rmax){
             res += Math.max(0,lmax-height[l]);
             lmax=Math.max(height[l],lmax);
             l+=1;
            }else{
                res+=Math.max(0,rmax-height[r]);
                rmax=Math.max(rmax,height[r]);
                r-=1;
            }
            
        }
        return res;
    }
}
