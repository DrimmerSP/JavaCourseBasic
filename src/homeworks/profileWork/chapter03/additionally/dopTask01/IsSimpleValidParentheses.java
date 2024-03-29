package homeworks.profileWork.chapter03.additionally.dopTask01;

import java.util.Stack;

public class IsSimpleValidParentheses {
    public static boolean validParentheses(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            }else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
