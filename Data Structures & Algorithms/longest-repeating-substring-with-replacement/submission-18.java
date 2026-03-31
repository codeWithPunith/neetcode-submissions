class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> count = new HashMap<>();
        int l=0,r,res=0,maxf=0;
        count.put(s.charAt(l),1);
        for(r=l+1;r<s.length();r++){
                count.put(s.charAt(r),count.getOrDefault(s.charAt(r),0)+1);
                maxf=Math.max(maxf,count.get(s.charAt(r)));
                while((r-l+1)-maxf>k){
                 count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;   
                }
             res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
