class Solution {
    public int maxProfit(int[] prices) {
        int sell=0,l=0,r=l+1,buy=0;
         while(r<prices.length){
            if(prices[r]-prices[l]<0){
                buy = prices[r];
              l=r;
              r++;
            }else{

                sell = Math.max(sell,prices[r]-prices[l]);
                r++;
             
            }
         }
         return sell;
    }
}
