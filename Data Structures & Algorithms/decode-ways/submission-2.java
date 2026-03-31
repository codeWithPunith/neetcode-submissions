class Solution {
    int count =0;
    public int numDecodings(String s) {
        rec(s,0);
        return count;
    }
    void rec(String s , int i){
       if(i >= s.length()){
         count++;
         return;
         }
       if(s.charAt(i)!='0') rec(s,i+1);
       if (i + 1 < s.length()) {
            int num = Integer.parseInt(s.substring(i, i + 2));
            if (num >= 10 && num <= 26)
                rec(s, i + 2);
        }
    }
}
