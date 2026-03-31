

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<double[]> carDetails = new ArrayList<>();
        Stack<double[]> stack = new Stack<>();

        for(int i = 0; i < position.length; i++){
            double t = (double)(target - position[i]) / speed[i];
            carDetails.add(new double[]{position[i], t});
        }

        carDetails.sort((a, b) -> Double.compare(b[0], a[0]));

        for(int i = 0; i < carDetails.size(); i++){
            if(stack.isEmpty()) {
                stack.push(carDetails.get(i));
            }
            else if(stack.peek()[1] < carDetails.get(i)[1]) {
              
                stack.push(carDetails.get(i));
            }
            
        }

        return stack.size();
    }
}
