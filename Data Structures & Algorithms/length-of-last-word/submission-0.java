class Solution {
    public int lengthOfLastWord(String s) {
     int res=0;
     int start = s.length()-1;

     while(s.charAt(start)==' ') start--;
     for(int i=start;i>=0;i--){
        if(s.charAt(i)==' ') return res;
        res++;
     }   
     return res;
    }
}