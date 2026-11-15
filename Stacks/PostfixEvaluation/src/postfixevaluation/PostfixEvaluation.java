package postfixevaluation;

/** Evaluates a space separated postfix expression, e.g. "3 3 + 5 *" = 30. */
public class PostfixEvaluation {

    public static void main(String[] args) {
        String[] tests = {"3 3 + 5 *", "5 1 2 + 4 * + 3 -", "1 2 -", "3 +", "4 0 /", "2 3 ^"};

        for (String exp : tests) {
            try {
                System.out.println(exp + "  =  " + evaluate(exp));
            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println(exp + "  ->  " + e.getMessage());
            }
        }
    }

    public static int evaluate(String exp) {
        String[] tokens = exp.trim().split("\\s+");
        Stack stack = new Stack(tokens.length);

        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                if (stack.isEmpty()) {
                    throw new IllegalArgumentException("Invalid expression!");
                }
                int b = stack.pop();
                if (stack.isEmpty()) {
                    throw new IllegalArgumentException("Invalid expression!");
                }
                int a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        if (b == 0) {
                            throw new IllegalArgumentException("Division by zero!");
                        }
                        stack.push(a / b);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid Operator : " + token);
                }
            }
        }

        int result = stack.pop();
        if (!stack.isEmpty()) {
            throw new IllegalArgumentException("Invalid expression!");
        }
        return result;
    }
}
