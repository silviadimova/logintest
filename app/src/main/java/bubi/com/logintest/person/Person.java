package bubi.com.logintest.person;

public class Person {
    private PersonName name;
    private String gender;
    private int age;
    private int calories;

    public String getName() {
        return name.toString();
    }
    public String getGender() {
        return gender;
    }
    public int getAge(){
        return age;
    }
    public void setName(String firstName, String lastName){
        PersonName newName = new PersonName();
        newName.setFirstName(firstName);
        newName.setLastName(lastName);
        name = newName;
    }
    public void setGender(String newGender){
        gender = newGender;
    }
    public void setAge(int newAge){
        age = newAge;
    }

    public void walk() {

    }
}

