class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int last = stk.pop();
                int newTop = last + stk.peek();
                stk.push(last); 
                stk.push(newTop);
            } 
            else if (op.equals("D")) {
                stk.push(stk.peek() * 2);
            } 
            else if (op.equals("C")) {
                stk.pop();
            } 
            else {
                stk.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int n : stk) sum += n;
        return sum;
    }
}