package bubi.com.logintest.ui.welcome;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;
import bubi.com.logintest.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class WelcomeActivityTest {

    @Rule
    public ActivityTestRule<WelcomeActivity> rule = new ActivityTestRule<>(WelcomeActivity.class);

    @Test
    public void testWelcomeMessageIsVisible() {
        onView(withText(R.string.welcome_label)).check(matches(isDisplayed()));

    }
}
