package cc.somkiat.basicunittesting;


import android.os.SystemClock;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.time.Clock;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class SaveButtonActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        onView(withId(R.id.userNameInput)).perform(replaceText("Kcomic"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText("kcomic@gmail.com"), closeSoftKeyboard());
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        SystemClock.sleep(2000);
    }

    @Test
    public void mainActivityTest2() {
        onView(withId(R.id.userNameInput)).perform(replaceText(""), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText("kcomic@gmail.com"), closeSoftKeyboard());
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        SystemClock.sleep(2000);
    }

    @Test
    public void mainActivityTest3() {
        onView(withId(R.id.userNameInput)).perform(replaceText("Kcomic"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText(""), closeSoftKeyboard());
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        SystemClock.sleep(2000);
    }

    @Test
    public void mainActivityTest4() {
        onView(withId(R.id.userNameInput)).perform(replaceText(""), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText(""), closeSoftKeyboard());
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        SystemClock.sleep(2000);
    }
}
