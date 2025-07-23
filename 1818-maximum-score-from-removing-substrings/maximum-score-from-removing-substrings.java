class Solution {
    public int maximumGain(String s, int x, int y) {
        // Step 1: decide which substring to remove first
        if (x > y) {
            return removeAndScore(s, "a", "b", x, y); // remove "ab" first
        } else {
            return removeAndScore(s, "b", "a", y, x); // remove "ba" first
        }
    }

    private int removeAndScore(String s, String first, String second, int high, int low) {
        Stack<Character> stack = new Stack<>();
        int score = 0;

        // First pass: remove high-scoring pair
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first.charAt(0) && ch == second.charAt(0)) {
                stack.pop();
                score += high;
            } else {
                stack.push(ch);
            }
        }

        // Build remaining string after high-score removal
        StringBuilder remaining = new StringBuilder();
        for (char ch : stack) {
            remaining.append(ch);
        }

        // Second pass: remove low-scoring pair
        stack.clear();
        for (char ch : remaining.toString().toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == second.charAt(0) && ch == first.charAt(0)) {
                stack.pop();
                score += low;
            } else {
                stack.push(ch);
            }
        }

        return score;
    }
}
