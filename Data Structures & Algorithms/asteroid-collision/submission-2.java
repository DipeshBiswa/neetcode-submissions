class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int ast: asteroids){

            boolean destroyed = false;
            if(ast < 0){
                while(!stack.isEmpty() && stack.peek() > 0){
                    if(Math.abs(ast) > stack.peek()){
                        stack.pop();
                    }
                    else if(Math.abs(ast) == Math.abs(stack.peek())){
                        stack.pop();
                        destroyed = true;
                        break;
                    }else{
                        destroyed = true;
                        break;
                    }     
                }  
            }
            if (!destroyed) {
            stack.push(ast);
        }
        }
        
        int[] array = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            array[i] = stack.get(i);
        }
        return array;
    }


}