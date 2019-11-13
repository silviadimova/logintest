package bubi.com.logintest.screentests;

public class HomeScreenRobot {

    private String viewName;

    public void findViewByName(String viewName){
        this.viewName = viewName;
        if(viewName!=null){
            printMessage(this.viewName +" found");
        }
        else{
            printMessage("the view is not found");
        }
    }

    public void verifyViewDisplayed() {
        printMessage ("property value is "+ viewName);
    }

    private void printMessage(String message){
        System.out.println(message);
    }

}



