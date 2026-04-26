class Solution {
    public boolean isAnagram(String s, String t) {
      char[] s1 = new char[26];
      char[] s2 = new char[26];
      if(s.length()!=t.length()) return false;
      for(int i=0;i<s.length();i++){
        s1[s.charAt(i)-'a']++;
        s2[t.charAt(i)-'a']++;
      }
      return Arrays.equals(s1,s2);
    }
}
