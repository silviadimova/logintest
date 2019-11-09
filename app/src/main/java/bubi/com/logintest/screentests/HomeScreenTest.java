package bubi.com.logintest.screentests;

public class HomeScreenTest {

    private HomeScreen homeScreen = new HomeScreen();
    private HomeScreenRobot homeScreenRobot = new HomeScreenRobot();
    private MockBackend mockBackend = new MockBackend();


    public void run(){
        mockBackend.setupMockResponse("Home screen API response");
        homeScreen.openScreen("Home screen");
        homeScreenRobot.findViewByName(null);
        homeScreenRobot.verifyViewDisplayed();

    }


}