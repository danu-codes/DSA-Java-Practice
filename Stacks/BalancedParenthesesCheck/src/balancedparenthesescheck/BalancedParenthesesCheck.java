package balancedparenthesescheck;

/** Checks whether (), [] and {} are balanced in a string, using a stack. */
public class BalancedParenthesesCheck {

    public static void main(String[] args) {
        String[] tests = {")()", "{[()]}", "([)]", "((", ""};

        for (String value : tests) {
            System.out.println("\"" + value + "\" -> "
                    + (checkBalanced(value) ? "Balanced!" : "Not Balanced!"));
        }
    }

    public static boolean checkBalanced(String value) {
        Stack stackObj = new Stack(value.length());

        for (char ch : value.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stackObj.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (matchesTop(ch, stackObj)) {
                    stackObj.pop();
                } else {
                    return false;
                }
            }
        }
        return stackObj.isEmpty();
    }

    private static boolean matchesTop(char ch, Stack stackObj) {
        if (stackObj.isEmpty()) {
            return false;
        }
        char peek = stackObj.peek();
        return (ch == ']' && peek == '[')
                || (ch == ')' && peek == '(')
                || (ch == '}' && peek == '{');
    }
}
