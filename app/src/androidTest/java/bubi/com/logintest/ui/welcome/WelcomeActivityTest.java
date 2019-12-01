package bubi.com.logintest.ui.welcome;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;
import bubi.com.logintest.R;
import bubi.com.logintest.ui.list.ListActivity;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static bubi.com.logintest.utils.TestUtils.isCurrentScreenInstanceOf;

@RunWith(AndroidJUnit4.class)
public class WelcomeActivityTest {

    @Rule
    public ActivityTestRule<WelcomeActivity> rule = new ActivityTestRule<>(WelcomeActivity.class);

    @Test
    public void testWelcomeMessageIsVisible() {
        onView(withText(R.string.welcome_label)).check(matches(isDisplayed()));
        onView(withId(R.id.open_list_screen_button)).check(matches(isDisplayed()));
    }
    @Test
    public void testWelcomeScreenOpensListScreen() {
        onView((withId(R.id.open_list_screen_button))).perform(click());
        isCurrentScreenInstanceOf(ListActivity.class);
    }
}
