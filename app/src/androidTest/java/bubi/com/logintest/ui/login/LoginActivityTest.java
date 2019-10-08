package bubi.com.logintest.ui.login;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import bubi.com.logintest.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isEnabled;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> rule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void testEmailFieldIsVisible() {
        onView(withHint(R.string.prompt_email)).check(matches(isDisplayed()));
    }

    @Test
    public void testSignInButtonDisabled() {
        onView(withId(R.id.login)).check(matches(not(isEnabled())));
    }

    @Test
    public void testSignInButtonEnabledIfCredentialsAreCorrect() {
        onView(withId(R.id.username)).perform(typeText("silviata77@gmail.com"));
        onView(withId(R.id.password)).perform(typeText("765efvggh"));
        onView(withId(R.id.login)).check(matches(isEnabled()));
    }

    @Test
    public void testSignInButtonNotEnabledIfPasswordNotCorrect() {
        onView(withId(R.id.username)).perform(typeText("silviata77@gmail.com"));
        onView(withId(R.id.password)).perform(typeText("765"));
        onView(withId(R.id.login)).check(matches(not(isEnabled())));
    }

}