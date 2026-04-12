class Solution {
    public int[] replaceElements(int[] arr) {
        int greatest = arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>greatest){
                int temp = greatest;
                greatest=arr[i];
                arr[i]=temp;
            }else{
                arr[i]=greatest;
            }
        }
        return arr;
    }
}