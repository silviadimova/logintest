package bubi.com.logintest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator tested = new Calculator();

    @Test
    public void shouldSumTwoNumbers() {
        int number1 = 10;
        int number2 = 20;
        int expected = 30;
        int result = tested.sumTwoNumbers(number1, number2);
        assertEquals(expected, result);
    }
}
