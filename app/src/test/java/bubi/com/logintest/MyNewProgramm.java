package bubi.com.logintest;

import org.junit.Test;

import bubi.com.logintest.calculations.CalculatorOperation;
import bubi.com.logintest.calculations.NewCalculator;

public class MyNewProgramm {

    private NewCalculator calculator = new NewCalculator();


    @Test
    public void testCalculations(){


        System.out.println(calculator.operateTwoNumbers(3,4, CalculatorOperation.ADD_OPERATION));
        System.out.println(calculator.operateTwoNumbers(5,6, CalculatorOperation.MULTIPLY_OPERATION));
        System.out.println(calculator.operateTwoNumbers(10,5, CalculatorOperation.SUBTRACT_OPERATION));

        int result1 = calculator.operateTwoNumbers(3,4, CalculatorOperation.ADD_OPERATION);
        int result2 = calculator.operateTwoNumbers(10,15, CalculatorOperation.ADD_OPERATION);

        int myNumber = 27;
        int result = myNumber % 7;
        System.out.println("result = "+result);

        System.out.println(calculator.operateTwoNumbers(result1,result2, CalculatorOperation.ADD_OPERATION));

        for (int counter = 0; counter <15; counter++){
            if(counter % 2 != 0){
                System.out.println(counter);
            }

        }
    }

    @Test
    public void test_JavaBook(){
        int x = 10, y = 5;
        System.out.println("x>y : " + (x>y));
        System.out.println("x==y : " + (x==y));
        System.out.println("x != y : "+(x!=y));

        int a = 6;
        int b = 4;
        System.out.println(a>b ? "a>b" : "b<=a");

        int first = 5;
        int second = 7;
        if (first==second){
            System.out.println("these two numbers are equal.");
        }else if (first>second){
            System.out.println("The first number is greater.");
        }else {
            System.out.println("The second number is greater.");
        }

        int number = 6;
        switch (number){
            case 1:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("The number is not two digit");
                break;
            case 5:
            case 7:
                System.out.println("The number is one digit");
                break;
            default:
                System.out.println("Have no idea what number is it");
        }


    }
    public static void printSign (int number){
        if (number > 0) {
            System.out.println("Positive");
        }
        else if (number < 0 ){
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }


    }


}

