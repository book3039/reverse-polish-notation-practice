import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversePolishNotationPractice {

    private static String userInput;
    private static Integer output;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a postfix expression: ");
            userInput = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        RpnCalculator calculator = new RpnCalculator(userInput);
        output = calculator.calculate();

        System.out.println(output);

    }
}
