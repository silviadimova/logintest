package bubi.com.logintest.calculations;

public class NewCalculator {

    public int operateTwoNumbers(int number1, int number2, CalculatorOperation operation) {
        switch (operation) {
            case ADD_OPERATION:
                return number1 + number2;
            case SUBTRACT_OPERATION:
                return number1 - number2;
            case DIVIDE_OPEARTION:
                return number1 / number2;
            case MULTIPLY_OPERATION:
                return number1 * number2;
            default:
                return number1 + number2;
        }
    }

//    public int addTwoNumbers(int number1, int number2) {
//        return number1 + number2;
//    }
//
//    public int subtractTwoNumbers(int number1, int number2) {
//        return number1 + number2;
//    }
//
//    public int multiplyTwoNumbers(int number1, int number2) {
//        return number1 * number2;
//    }
//
//    public int divideTwoNumbers(int number1, int number2) {
//        return number1 / number2;
//    }

    public int subtractThreeNumbers(int number1, int number2, int number3) {
        return number1 - number2 - number3;
    }

}
