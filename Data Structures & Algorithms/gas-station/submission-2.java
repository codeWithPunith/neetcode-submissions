class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] diff = new int[gas.length];
        int gasamt =0;
        int costamt=0;
        for(int i=0;i<gas.length;i++){
            gasamt+=gas[i];
            costamt+=cost[i];
            diff[i]=gas[i]-cost[i];
        }
        if(gasamt<costamt) return -1;
        int total=0;
        int start =0;
        for(int i=0;i<gas.length;i++){
            total +=diff[i];
            if(total<0){
                total =0;
                start=i+1;
            }
        }
        return start
    ;
    }
}
