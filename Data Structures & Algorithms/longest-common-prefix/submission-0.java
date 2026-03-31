class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = strs[0];
        for(int i=1;i<strs.length;i++){
            StringBuilder newres = new StringBuilder();
            int len = Math.min(common.length(), strs[i].length());
            for(int j =0;j<len;j++){
                if(common.charAt(j)==strs[i].charAt(j)){
                    newres.append(common.charAt(j));
                }else break;
            }
            common = newres.toString();
        }
        return common;
    }
}