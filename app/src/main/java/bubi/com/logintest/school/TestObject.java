package bubi.com.logintest.school;

public class TestObject {


    public void getTest(){

    }
    public void getTest(int age){
        if (age == 20) {
            System.out.println("The person is 20");
        }
        else if(age == 30) {
            System.out.println("The person is 30");
        }
        else {
            System.out.println("The person is NOT 20 or 30");
        }

    }
    public void getTest (int age, String name){
        if(age <= 5){
            System.out.println(name + " is a toddler");
        }
        else if(age>=6 && age<10){
            System.out.println(name+" is a child");

        }
        else if(age>=10 && age<=18){
            System.out.println(name+" is teen");
        }
        else{
            System.out.println(name + " is adult");
        }
    }
    public void getGreeting (String name){
        if( name.equals("morning")){
            System.out.println("good morning");
        }
        else if (name.equals("noon")){
            System.out.println("good noon");
        }
        else if (name.equals("afternoon")){
            System.out.println("good afternoon");
        }
        else if (name.equals("evening")){
            System.out.println("good evening");
        }
        else{
            System.out.println("greeting not available");

        }

    }

    public String getGreeting2 (String daytime){
        if(daytime.equals("morning")) {
            return "good morning";
        }
        else if(daytime.equals("noon")){
            return "good day";
        }
        else if( daytime.equals("afternoon")){
            return "good afternoon";
        }
        else if (daytime.equals("evening")){
            return "good evening";
        }
        else{
            return "hello";
        }

    }


    public static void getTest1(){

    }
}
