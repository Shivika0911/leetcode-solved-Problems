import java.util.Stack;

class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                st.push(score);
                score = 0;  
            } else {
                score = st.pop() + Math.max(2 * score, 1);
            }
        }

        return score;
    }
}