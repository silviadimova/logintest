package bubi.com.logintest;

import org.junit.Test;

import bubi.com.logintest.person.Person;
import bubi.com.logintest.person.PersonName;

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

    @Test
    public void shouldHaveNames() {
        final PersonName personName = new PersonName();
        personName.setFirstName("First Name");
        personName.setLastName("Second Name");
        tested.setName(personName.getFirstName(), personName.getLastName());
        final String expected = "First Name, Second Name";
        final String result = tested.getAddress();
        assertEquals(expected, result);
    }
}
