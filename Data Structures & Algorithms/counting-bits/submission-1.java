class Solution {
    public int[] countBits(int n) {
     int dp[] = new int[n+1];
     int prevPow=1;
     for(int i=1;i<dp.length;i++){
        if(i==2*prevPow) prevPow=i;
        dp[i]=1+dp[i-prevPow];
     }   
     return dp;
    }
}
