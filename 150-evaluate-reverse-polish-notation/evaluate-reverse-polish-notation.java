class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        int result = 0;

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            // Check if the token is a number (not an operator)
            if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
                stk.push(Integer.parseInt(token));
            } else {
                int top = stk.pop();
                int top2 = stk.pop();

                if (token.equals("+")) 
                {
                    result = top2 + top;
                } else if (token.equals("-")) 
                {
                    result = top2 - top;
                } else if (token.equals("*")) 
                {
                    result = top2 * top;
                } else if (token.equals("/"))
                {
                    result = top2 / top;
                }

                stk.push(result);
            }
        }

        return stk.pop();
    }
}