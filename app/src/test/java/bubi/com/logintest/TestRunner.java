package bubi.com.logintest;

import org.junit.Test;

import bubi.com.logintest.screentests.DetailsScreenTest;
import bubi.com.logintest.screentests.HomeScreenTest;
import bubi.com.logintest.screentests.SomeOtherScreenTest;

public class TestRunner {

    private HomeScreenTest homeScreenTest = new HomeScreenTest();
    private DetailsScreenTest detailsScreenTest = new DetailsScreenTest();
    private SomeOtherScreenTest someOtherScreenTest = new SomeOtherScreenTest();

    @Test
    public void runHomeScreenTest(){
        homeScreenTest.run();
    }

    @Test
    public void runDetailsScreenTest(){
        detailsScreenTest.run();

    }

    @Test
    public void runSomeOtherScreenTest(){
        someOtherScreenTest.run();
    }

}
