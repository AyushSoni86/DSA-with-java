import java.util.List;
import java.util.Stack;

public class ParenthesisMatching {
    public static void main(String[] args) {
        String str = " static boolean match(char a, char b) {\n" +
                "        if (a == '(' && b == ')')\n" +
                "            return true;\n" +
                "        if (a == '[' && b == ']')\n" +
                "            return true;\n" +
                "        if (a == '{' && b == '}')\n" +
                "            return true;\n" +
                "        return false;\n" +
                "    }";
        System.out.println((isParenthesisMatch(str))
                ? "Parenthesis are matching  successfully"
                : "Parenthesis are not matching ");
    }


    static boolean isParenthesisMatch(String str) {

        if (str.isEmpty()) return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            }
            if (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {
                if (stack.isEmpty()) return false;

                int top = stack.peek();
                if (str.charAt(i) == ')' && top == '('
                        || str.charAt(i) == ']' && top == '['
                        || str.charAt(i) == '}' && top == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
