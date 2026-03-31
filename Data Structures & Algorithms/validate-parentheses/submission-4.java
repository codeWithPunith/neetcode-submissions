class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        char temp;
        if(n%2!=0) return false;
        
        for(int i =0;i<n;i++){
            temp= (char)s.charAt(i);
            if(temp=='['||temp=='{'||temp=='(') stack.push(temp);
            else if(stack.isEmpty()) return false;
            else {
                switch(stack.pop()){
                    case '[': if(temp==']') continue ;
                    break;
                    case  '{':if(temp=='}') continue ;
                    break;
                    case  '(':if(temp==')') continue ;
                    break;
                    default: return false ;
                }
                return false ;
            }
        }if(stack.isEmpty())return true;
        else return false ;
    }
}
