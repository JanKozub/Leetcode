package programming_skills;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("[(])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;

                int c = ch - stack.getLast();

                if (c == 1) {
                    stack.pop();
                    continue;
                }
                if (c == 2) {
                    stack.pop();
                    continue;
                }

                return false;
            }
        }
        return stack.isEmpty();
    }
}
