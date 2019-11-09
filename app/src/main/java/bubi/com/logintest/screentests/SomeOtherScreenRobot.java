package bubi.com.logintest.screentests;

public class SomeOtherScreenRobot {
    public void findViewByName(String viewName) {
        if(viewName !=null){
            System.out.println(viewName + " is found");
        }
        else{
            System.out.println("The view is not found");
        }

    }

    public void verifyViewDisplayed() {
        System.out.println("The view is displayed");
    }
}
