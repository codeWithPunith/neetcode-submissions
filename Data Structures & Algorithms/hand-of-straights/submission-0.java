class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int smallest =Integer.MAX_VALUE;
        int[] bucket = new int[1000];
        for(int n : hand){
            bucket[n]++;
            smallest = Math.min(smallest,n);
        }
        int k=0;
        while(k<hand.length){
        int i=0;
        while(bucket[i]==0){
           i++; 
        }
        for(int j=i;j<groupSize+i;j++){
            if(bucket[j]==0) return false;
            bucket[j]--;
            k++;
        }
        }
        return true;
    }
}
