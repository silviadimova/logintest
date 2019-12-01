package bubi.com.logintest.ui.list;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Random;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;
import bubi.com.logintest.R;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static bubi.com.logintest.utils.RecyclerViewActions.scrollToPosition;
import static bubi.com.logintest.utils.TestUtils.generateRandomNumberInRange;
import static bubi.com.logintest.utils.TestUtils.withRecyclerViewItemAtPosition;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasDescendant;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class ListActivityTest {

    @Rule
    public ActivityTestRule<ListActivity> rule = new ActivityTestRule<>(ListActivity.class);

    @Test
    public void testIsSpecificListItemWithCorrectData() {
        int randomNumber = generateRandomNumberInRange(0, 6);
        onView(withRecyclerViewItemAtPosition(R.id.recycler_view, randomNumber))
                .check(matches(hasDescendant(withText("Product "+ randomNumber))))
                .check(matches(hasDescendant(withText("Product Description "+randomNumber))));
    }

    @Test
    public void testShouldOpenDetailsScreenWithCorrectData() {
        onView(withId(R.id.recycler_view)).perform(scrollToPosition(5));
        onView(withRecyclerViewItemAtPosition(R.id.recycler_view, 5)).perform(click());
    }

}
