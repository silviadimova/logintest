package bubi.com.logintest;

public class Cup {

    public int capacity;
    private String type;

    public Cup(int inputCapacity) {
        capacity = inputCapacity;
    }

//    public int getCapacity() {
//        return capacity;
//    }

    public void takeOffHalfOfTheCapacity() {
        capacity = capacity / 2;
    }

    public void setType(String newType) {
        type = newType + "-";
    }

    public String getType() {
        return type;
    }
}
