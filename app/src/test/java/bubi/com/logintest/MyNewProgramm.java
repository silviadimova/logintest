package bubi.com.logintest;

import org.junit.Test;

import bubi.com.logintest.calculations.NewCalculator;

public class MyNewProgramm {

    private NewCalculator calculator = new NewCalculator();


    @Test
    public void testCalculations(){

        System.out.println(calculator.addTwoNumbers(3,4));
        System.out.println(calculator.multiplyTwoNumbers(5,6));
        System.out.println(calculator.subtractThreeNumbers(10,5,3));

        int result1 = calculator.addTwoNumbers(3,4);
        int result2 = calculator.addTwoNumbers(10,15);

        int myNumber = 27;
        int result = myNumber % 7;
        System.out.println("result = "+result);

        System.out.println(calculator.addTwoNumbers(result1,result2));

        for (int counter = 0; counter <15; counter++){
            if(counter % 2 != 0){
                System.out.println(counter);
            }

        }
    }
}
