class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for(int i = 0; i<temperatures.length; i++){
            if(i == 0){stack.add(new int[]{temperatures[i], i});}
            while(!stack.isEmpty() && temperatures[i] > stack.peek()[0]){
                int[] top = stack.pop();
                res[top[1]] = i - top[1];
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return res;
    }
}
