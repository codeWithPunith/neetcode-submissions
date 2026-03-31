class Solution {
    public int tribonacci(int n) {
        //if(n<=2){
        if (n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
       
    
       int dp3=0;
      int dp2=1;
       int dp1=1;
       int res=0;
       int i=3;
       while(i<=n){
          res=dp1+dp2+dp3;
          dp3=dp2;
          dp2=dp1;
          dp1=res;

          i++;
       } 
       return dp1;
    }
}