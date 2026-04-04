class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives =0;
        int tens=0;
        int twenties =0;
        for(int n : bills){
            if(n==5) fives++;
            if(n==10){
                if(fives>0){
                    fives--;
                    tens++;
                }else return false;
            }
            if(n==20){
                if((fives>0 && tens>0)){
                   twenties++;
                   fives--;
                   tens--;
                }else if (fives>=3){
                   twenties++;
                   fives-=3;
                }
                else return false;
            }
        }
        return true;
    }
}