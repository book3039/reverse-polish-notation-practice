import java.util.ArrayDeque;
import java.util.Deque;

public class RpnCalculator {


    private final String userInput;
    private int output;
    private final Deque<Integer> stack = new ArrayDeque<>();

    public RpnCalculator(String userInput) {
        this.userInput = userInput;
    }

    public int calculate() {
        for (int i = 0; i < userInput.length(); i++) {
            if (Character.isDigit(userInput.charAt(i))) {
                stack.push(userInput.charAt(i) - '0');
            } else {
                char operation = userInput.charAt(i);
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = performOperations(num1, num2, operation);

                stack.push(result);
            }
        }

        output = stack.pop();

        return output;
    }

    private int performOperations(int num1, int num2, char operation) {
        int result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }

        return result;
    }
}
