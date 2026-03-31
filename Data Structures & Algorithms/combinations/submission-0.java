class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        rec(arr,k,0,list);
        return res;
    }

    void rec(int[] arr,int k,int i,ArrayList<Integer> list){
       if(list.size()==k){
        res.add(new ArrayList<>(list));
        return ;
       }
      if(i<arr.length){ 
        list.add(arr[i]);
       rec(arr,k,i+1,list);
       list.remove(list.size()-1);
       rec(arr,k,i+1,list);
       }
    }
}