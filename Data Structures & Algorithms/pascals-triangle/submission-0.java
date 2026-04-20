class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ele = new ArrayList<>();
        ele.add(1);
        List<Integer> ele2 = new ArrayList<>(Arrays.asList(1, 1));
        if(numRows==1){
            res.add(ele);
            return res;
        }
        if(numRows==2){
             res.add(ele);
             res.add(ele2);
            return res;
        }
        res.add(ele);
        res.add(ele2);
        for(int i=2;i<numRows;i++){
            List<Integer> prevList = res.get(res.size()-1);
            List<Integer> loopele = new ArrayList<>();
            loopele.add(1);
            int k=1;
           
            for(int j=0;j<prevList.size()-1;j++){
               loopele.add(prevList.get(j)+prevList.get(j+1));
            }
            loopele.add(1);
            res.add(loopele);
        }
        return res;
    }
}