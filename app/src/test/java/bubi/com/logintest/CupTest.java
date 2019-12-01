package bubi.com.logintest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CupTest {
    private Cup tested = new Cup(100);

    @Test
    public void shouldHaveInitialCapacity() {
        int expected = 100;
        int result = tested.capacity;
        assertEquals(expected, result);
    }

    @Test
    public void shouldRemoveHalfOfTheCapacity() {
        int expected = 25;
        tested.takeOffHalfOfTheCapacity();
        tested.takeOffHalfOfTheCapacity();
        int result = tested.capacity;
        assertEquals(expected, result);
    }

    @Test
    public void shouldApplyNewType() {
        String expected = "tea";
        tested.setType(expected);
        String result = tested.getType();
        assertEquals(expected, result);
    }
}
