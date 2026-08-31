class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> closing = new HashMap<>();
        closing.put(')', '(');
        closing.put('}', '{');
        closing.put(']', '[');

        for(char c: s.toCharArray()){
            if(closing.containsKey(c)){
                if(stack.size() == 0){
                    return false;
                }
                if(stack.peek() == closing.get(c)){
                    stack.pop();
                    continue;
                }else{
                    return false;
                }
            }
            stack.push(c);
        }
        if(stack.size() != 0){
            return false;
        }
        return true;
        

    }
}
