package bubi.com.logintest.screentests;

public class DetailsScreenTest {

    private DetailsScreen detailsScreen = new DetailsScreen();
    private DetailsScreenRobot detailsScreenRobot = new DetailsScreenRobot();
    private MockBackend mockBackend = new MockBackend();

    public void run(){
        mockBackend.setupMockResponse("Details screen API response");
        detailsScreen.openScreen("Details screen");
        detailsScreenRobot.findViewByName("Details screen view");
        detailsScreenRobot.verifyViewDisplayed();

    }

}
