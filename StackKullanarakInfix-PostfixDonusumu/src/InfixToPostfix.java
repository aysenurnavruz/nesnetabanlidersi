public class InfixToPostfix {
    String input;
    String postfix;

    InfixToPostfix(String input) {
        this.input = input;
        this.postfix = "";
    }

    boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    int getPriority(char op) {
        if (op == '+' || op == '-') {
            return 1;
        }
        if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }

    boolean processPriority(char t, char c) {
        if (getPriority(t) > getPriority(c)) {
            return true;
        }
        if (getPriority(t) == getPriority(c)) {
            return t == c;
        }
        return false;
    }

    void convertToPostfix() {
        LinkStack stack = new LinkStack();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && isOperator(stack.peek()) && processPriority(stack.peek(), ch)) {
                    postfix += stack.pop();
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }
    }
}

