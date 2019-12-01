package bubi.com.logintest.person;

public class Person {
    private PersonName name;
    private String gender;
    private int age;
    private int calories;
    private String address;
    private String country;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void walk() {
        float numberOne = 10.1f;
        float numberTwo = 10.2f;
        int result = (int) (numberOne + numberTwo);
    }
    public void setAddress() {
        String homeNumber = "15";
        String streetName = "Nevinson";
        PersonName silvia = new PersonName();
        boolean isHomeNumberSameAsStreeName = homeNumber == streetName;
    }

    public PersonName getName() {
        return name;
    }
}

