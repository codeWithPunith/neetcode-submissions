class Solution {
    HashMap<Integer,Boolean> set = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s,wordDict,0);
    }
    boolean dfs(String s,List<String> wordDict,int i){
        if(i>=s.length()) return true;
        if(set.containsKey(i)){
            return set.get(i);
        }
        for(String word : wordDict){
            if(word.charAt(0)==s.charAt(i)){
                //compare the strings 
                if(i + word.length() <= s.length() && 
                   word.equals(s.substring(i, i + word.length()))) {
                    set.put(i,true);
                   if (dfs(s, wordDict, i + word.length()))  // FIX
                        return true;
                   else set.put(i,false);
}
}
}
      return false;
}}
