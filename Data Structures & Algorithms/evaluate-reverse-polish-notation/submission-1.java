class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i<tokens.length; i++){
            switch(tokens[i]){
                case "+":
                    int v1 = s.pop();
                    int v2 = s.pop();
                    s.add(v1 + v2);
                    continue;
                case "-":
                    int v3 = s.pop();
                    int v4 = s.pop();
                    s.add(v4 - v3);
                    continue;
                case "*":
                    int v5 = s.pop();
                    int v6 = s.pop();
                    s.add(v5 * v6);
                    continue;
                case "/":
                    int v7 = s.pop();
                    int v8 = s.pop();
                    s.add(v8 /v7);
                    continue;
            }
             s.add(Integer.parseInt(tokens[i]));
        }
        return s.peek();
    }
}
