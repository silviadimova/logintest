package bubi.com.logintest.ui.login;


import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.View;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiSelector;
import bubi.com.logintest.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.assertThat;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isEnabled;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> rule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void checkingLoginActivityElements() {
        onView(withId(R.id.username)).check(matches(isDisplayed())).check(matches(withHint("User name/email")));
        onView(withId(R.id.password)).check(matches(isDisplayed())).check(matches(withHint("Password")));
        onView(withId(R.id.login)).check(matches(isDisplayed())).check(matches(withText("SIGN IN"))).check(matches(not(isEnabled())));
        onView(withText("LoginTest")).check(matches(isDisplayed()));


    }

    @Test
    public void testSignInButtonIsEnabledIfUsernameAndPasswordAreCorrect() {
        onView(withId(R.id.username)).perform(typeText("silviata@yahoo.co.uk"));
        onView(withId(R.id.password)).perform(typeText("type12"));
        onView(withId(R.id.login)).check(matches(isEnabled()));

    }

    @Test
    public void testSignInButtonIsDisabledIfPasswordIsNotCorrect() {
        onView(withId(R.id.username)).perform(typeText("silviata@yahoo.co.uk"));
        onView(withId(R.id.password)).perform((typeText("type1")));
        onView(withId(R.id.login)).check(matches(not(isEnabled())));
    }

    @Test
    public void testSignInButtonIsDisabledIfEmailIsNotCorrect() {
        onView(withId(R.id.username)).perform(typeText("silviata@yahoo,com"));
        onView(withId(R.id.password)).perform(typeText("type12"));
        onView((withId(R.id.login))).check(matches(not(isEnabled())));
    }

    @Test
    public void testSignInButtonIsDisabledIfUserEditsUsernameOrPasswordToIncorrect() {
        onView(withId(R.id.username)).perform(typeText("silviata@yahoo.co.uk"));
        onView(withId(R.id.password)).perform(typeText("type12"));
        onView((withId(R.id.login))).check(matches(isEnabled()));
        onView((withId(R.id.username))).perform(replaceText("silviata.yahoo.co.uk"));
        onView((withId(R.id.login))).check(matches(not(isEnabled())));


    }

    @Test
    public void testIfCredentialsRemainInPlaceAfterMinimisingScreen() {
        onView(withId(R.id.username)).perform(typeText("silviata@yahoo.co.uk"));
        onView(withId(R.id.password)).perform(typeText("type123"));
        onView(withId(R.id.login)).check(matches(isEnabled()));

        UiDevice device = UiDevice.getInstance(getInstrumentation());
        device.pressHome();
        try {
            device.pressRecentApps();
            UiObject appBackground = new UiObject(new UiSelector().description("LoginTest"));
            appBackground.click();
            onView(withId(R.id.login)).check(matches(isEnabled()));
            onView(withId(R.id.username)).check(matches(withText("silviata@yahoo.co.uk")));
            onView(withId(R.id.password)).check(matches(withText("type123")));
        } catch (RemoteException ex) {
            assertEquals(true, false);
        } catch (UiObjectNotFoundException ex){
            assertEquals(true, false);
        }

    }

    @Test
    public void sosososo() {
        Context context = getInstrumentation().getContext();
//        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Intent intent = context.getPackageManager().getLaunchIntentForPackage("com.google.android.gm");
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        // Clear out any previous instances
        context.startActivity(intent);
    }
}