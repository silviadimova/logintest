package bubi.com.logintest;

import org.junit.Test;

import bubi.com.logintest.person.Person;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    private Person tested = new Person();

    @Test
    public void shouldHaveAge() {
        int expected = 100;
        tested.setAge(expected);
        int result = tested.getAge();
        assertEquals(expected, result);
    }
}
