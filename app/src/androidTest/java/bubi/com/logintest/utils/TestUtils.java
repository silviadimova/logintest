package bubi.com.logintest.utils;

import android.app.Activity;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

import org.hamcrest.Description;
import org.hamcrest.Matcher;

import java.util.Collection;

import androidx.test.espresso.matcher.BoundedMatcher;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;
import static androidx.test.runner.lifecycle.Stage.RESUMED;
import static org.junit.Assert.assertTrue;

public class TestUtils {

    /**
     * Check is current screen a specific Activity class
     */
    public static void isCurrentScreenInstanceOf(Class clazz) {
        final Activity[] activity = new Activity[1];
        InstrumentationRegistry.getInstrumentation().runOnMainSync(new Runnable( ) {
            public void run() {
                Activity currentActivity;
                Collection resumedActivities = ActivityLifecycleMonitorRegistry.getInstance().getActivitiesInStage(RESUMED);
                if (resumedActivities.iterator().hasNext()){
                    currentActivity = (Activity) resumedActivities.iterator().next();
                    activity[0] = currentActivity;
                }
            }
        });

        assertTrue(clazz.isInstance(activity[0]));
    }

    /**
     * Selects recyclerview item by the recyclerview resource id and item position
     * @param recyclerViewId - resource id
     * @param position - the position of the wanted item in the list (starts from 0 index)
     * @return - The RecyclerView's selector
     */
    public static Matcher<View> withRecyclerViewItemAtPosition(int recyclerViewId, int position) {
        return new RecyclerViewMatcher(recyclerViewId).atPosition(position);
    }

    /**
     * Checks is the password field's text hidden
     * @return - the matcher
     */
    public static Matcher<View> isPasswordTextHidden() {
        return new BoundedMatcher<View, EditText>(EditText.class) {
            @Override
            public void describeTo(Description description) {
                description.appendText("Password is hidden");
            }

            @Override
            public boolean matchesSafely(EditText editText) {
                //returns true if password is hidden
                return editText.getTransformationMethod() instanceof PasswordTransformationMethod;
            }
        };
    }

    public static int generateRandomNumberInRange(int min, int max) {
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }
}
