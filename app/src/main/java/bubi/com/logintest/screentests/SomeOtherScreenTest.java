package bubi.com.logintest.screentests;

public class SomeOtherScreenTest {

    private SomeOtherScreen someOtherScreen = new SomeOtherScreen();
    private SomeOtherScreenRobot someOtherScreenRobot = new SomeOtherScreenRobot();
    private MockBackend mockBackend = new MockBackend();

    public void run(){
        mockBackend.setupMockResponse("Some other screen API response");
        someOtherScreen.openScreen("Some other screen");
        someOtherScreenRobot.findViewByName("Some other screen view");
        someOtherScreenRobot.verifyViewDisplayed();
    }
}
