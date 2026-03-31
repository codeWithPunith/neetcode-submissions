class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<>();
        int res=0,num1,num2;
        if(tokens.length==1){
            res= Integer.parseInt(tokens[0]);
            return res;
        }
        for(String temp :tokens){
            if(isNumber(temp)){
            stk.push(Integer.parseInt(temp));
           }else{
              num2=stk.pop();
              num1=stk.pop();
              switch (temp){
                case "+": res=num1+num2;
                break;
                case "-": res=num1-num2;
                break;
                case "*": res=num1*num2;
                break;
                case "/": res=num1/num2;
                break;
                default: res=99999;
              }
              stk.push(res);
           }
        }
        return res;
    }
     private boolean isNumber(String s) {   
        if (s.length() > 1 && (s.charAt(0) == '-' || s.charAt(0) == '+')) {
            return true; 
        }
        return Character.isDigit(s.charAt(0));
    }
}
