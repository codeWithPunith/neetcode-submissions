class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        stk.push(asteroids[0]);
        for(int i=1;i<asteroids.length;i++){
            int ast = asteroids[i];
            while(!stk.isEmpty() && stk.peek()>0 && ast<0){
                int poped = stk.pop();
                 if (Math.abs(poped) == Math.abs(ast)) {
                    ast = 0; 
                    break;
                } else if (Math.abs(poped) > Math.abs(ast)) {
                    ast = poped; 
                    break;
                }
                
            }
            if (ast != 0) {
                stk.push(ast);
            }
            }
        int[] res = new int[stk.size()];
        for(int i = 0; i < stk.size(); i++){
            res[i] = stk.get(i);
        }

        return res;

    }
}