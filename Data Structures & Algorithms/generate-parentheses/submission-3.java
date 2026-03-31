class Solution {
    List<String> supa = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(n,0,"");
        return supa;
    }

    void dfs(int n,int i,String params){
        String pranthesis = params;
    if(i==2*n){
    if(checkParanthesis(pranthesis)){
        supa.add(params);
        return;
    }else return;
    }
    dfs(n,i+1,params+'(');
    dfs(n,i+1,params+')');
    }

    boolean checkParanthesis(String s) {
    int bal = 0;
    for (char c : s.toCharArray()) {
        if (c == '(') bal++;
        else if (c == ')') {
            bal--;
            if (bal < 0) return false; 
        }
    }
    return bal == 0;
}

}
