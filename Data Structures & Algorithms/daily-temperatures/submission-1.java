class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();

        for(int i = 0; i<temperatures.length; i++){
            if(i == 0){stack.add(new int[]{temperatures[i], i});}
            while(!stack.isEmpty() && stack.peek()[0] < temperatures[i]){
                int[] val = stack.pop();
               res[val[1]] = i - val[1];
               
            }
            stack.push(new int[]{temperatures[i], i});

        }
        return res;

    }
}
