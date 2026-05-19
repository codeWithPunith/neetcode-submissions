class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        HashSet<Integer> res = new HashSet<>();
        for(int[] t : triplets){
            if(t[0]>target[0]||t[1]>target[1]||t[2]>target[2] ) continue;
            
            for(int j=0;j<3;j++){
                if(t[j]==target[j]) res.add(j);
            }
        }
        return res.size()==3;
        
    }
}
