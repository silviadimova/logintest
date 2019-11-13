package bubi.com.logintest.screentests;

public class MockBackend {

    private String response;

    public void setupMockResponse(String response){
        this.response = response;
       System.out.println(this.response+ " is setup");
    }
}
