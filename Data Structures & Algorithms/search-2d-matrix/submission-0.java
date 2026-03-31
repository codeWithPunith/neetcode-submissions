class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low =0 ,high = matrix.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(matrix[mid][matrix[0].length-1]<target){
                low= mid+1;
            }else if(matrix[mid][matrix[0].length-1]>target){
                high = mid-1;
            }
                for(int i =0 ;i<matrix[0].length;i++){
                    if(target== matrix[mid][i]) return true;
                    continue;
                }
            
        }
        return false ;
    }
}
