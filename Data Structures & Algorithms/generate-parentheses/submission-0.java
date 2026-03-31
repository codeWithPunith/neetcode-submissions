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
    Stack<Character> stk = new Stack<>();
    for (char ch : s.toCharArray()) {
        if (ch == '(') {
            stk.push(ch);
        } else if (ch == ')') {
            if (stk.isEmpty() || stk.peek() != '(') {
                return false;
            }
            stk.pop();
        }
    }
    return stk.isEmpty();
}

}
