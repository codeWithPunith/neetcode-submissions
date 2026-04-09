class Solution {
    public int minimumRecolors(String blocks, int k) {
        int res=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W') res++;
        }
        int demoRes = res;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i-k)=='W') demoRes--;
            if(blocks.charAt(i)=='W'){
                demoRes++;
            }
            res = Math.min(res,demoRes);
        }
        return res;
    }
}