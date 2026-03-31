class Solution {
    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int[] indices = new int[2];
        int res=1;

        for(int i=0;i<arr.length;i++){
            int l=i-1,r=i+1;
            while(l>=0 && r<arr.length){
                 if(arr[l]==arr[r]){
                   res = Math.max((r-l+1),res);
                   if(res==r-l+1){
                    indices[0]=l;
                    indices[1]=r;
                   }
                   l--;
                   r++;
                 }else break;
            }
            l=i;r=i+1;
            while(l>=0 && r<arr.length){
                if(arr[l]==arr[r]){
                 res = Math.max((r-l+1),res);
                 if(res==r-l+1){
                    indices[0]=l;
                    indices[1]=r;
                   }
                 l--;
                 r++;
                }else break;
            }
        }
        System.out.println(res);
        return s.substring(indices[0],indices[1]+1);
    }
}
