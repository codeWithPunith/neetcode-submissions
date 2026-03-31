class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int s1 = 0, s2 = 0;

        while (s1 < word1.length() && s2 < word2.length()) {
            s.append(word1.charAt(s1++)).append(word2.charAt(s2++));
        }

        if (s1 < word1.length()) {
            while (s1 < word1.length()) {
                s.append(word1.charAt(s1++));
            }
        }

        if (s2 < word2.length()) {
            while (s2 < word2.length()) {
                s.append(word2.charAt(s2++));
            }
        }

        return s.toString();
    }
}