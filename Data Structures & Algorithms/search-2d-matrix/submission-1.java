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
            int low2 =0 ,high2=matrix[0].length-1;
          while (low2 <= high2) {
    int m = low2 + (high2 - low2) / 2;
    if (target < matrix[mid][m]) {
        high2 = m - 1;
    } else if (target > matrix[mid][m]) {
        low2 = m + 1;
    } else {
        return true;
    }
}

            
        }
        return false ;
    }
}
