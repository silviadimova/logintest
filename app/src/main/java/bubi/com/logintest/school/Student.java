package bubi.com.logintest.school;

public class Student {
    public int age;
    private String name = defaultStudentName;
    private char gender;
    private MedicalStatus medicalStatus;
    public static String defaultStudentName = "No name";

    public String getName () {
        return name;
    }

    public void setName ( String newName ){
        name = newName;
    }

    public void setMedicalStatus (MedicalStatus newMedStat) {
        medicalStatus = newMedStat;
    }

    public void setGender (char g){
        gender = g;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
