package bubi.com.logintest.calculations;

public class NewCalculator {

    public int operateTwoNumbers(int number1, int number2, CalculatorOperation operation) {
        switch (operation) {
            case SUBTRACT_OPERATION:
                return number1 - number2;
            case DIVIDE_OPEARTION:
                return number1 / number2;
            case MULTIPLY_OPERATION:
                return number1 * number2;
            case ADD_OPERATION:
            default:
                return number1 + number2;
        }
    }

    public int subtractThreeNumbers(int number1, int number2, int number3) {
        return number1 - number2 - number3;
    }

}
