class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable<Character, Integer> sh = new Hashtable<>();
        Hashtable<Character, Integer> th = new Hashtable<>();

        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
               if (sh.containsKey(s.charAt(i))) {
    sh.put(s.charAt(i), sh.get(s.charAt(i)) + 1);
} else {
    sh.put(s.charAt(i), 1);
}

                if (th.containsKey(t.charAt(i))) {
                    th.put(t.charAt(i), th.get(t.charAt(i)) + 1);
                }else{
                th.put(t.charAt(i), 1);
                }
            }

            if (sh.equals(th)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
