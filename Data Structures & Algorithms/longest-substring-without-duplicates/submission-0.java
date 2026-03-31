class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> sett = new HashSet<>();
        int l=0,max=0;
        for(int i=0;i<s.length();i++){
            while ( sett.contains(s.charAt(i))){
                sett.remove(s.charAt(l));
                l++;
            }
          
             max =Math.max(max,(i-l+1));
               sett.add(s.charAt(i));
        }
        return max;
    }
}
