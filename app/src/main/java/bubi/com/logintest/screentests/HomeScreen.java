package bubi.com.logintest.screentests;

public class HomeScreen {

    private String screenName;

    public void openScreen(String screenName){
        this.screenName = screenName;
        System.out.println(this.screenName+" is opened");
    }
}
