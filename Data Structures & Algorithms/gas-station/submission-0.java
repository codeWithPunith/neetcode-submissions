class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        for(int i=0;i<gas.length;i++){
            int j=i;
            int initialGas =0;
            boolean roundCompleted =false;
            do{
                roundCompleted = true;
                initialGas +=gas[j%gas.length];
                if(initialGas<cost[j%gas.length]){ 
                    roundCompleted =false;
                    break;
                    }
                else initialGas-=cost[j%gas.length];
                j++;
            }while(j%gas.length!=i);
            if(roundCompleted) return i;
        }
        return -1;
    }
}
