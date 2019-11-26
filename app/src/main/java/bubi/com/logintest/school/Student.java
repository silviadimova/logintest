package bubi.com.logintest.school;

public class Student {
    public int age;
    private String name = defaultStudentName;
    private char gender;
    private MedicalStatus medicalStatus;
    public static String defaultStudentName = "No name";
    private SkinColour skinColour;

    public enum SkinColour{
        SKIN_COLOUR_WHITE,
        SKIN_COLOUR_BLACK,
        SKIN_COLOUR_YELLOW;
    }

    public Student(String name, int age, char gender, SkinColour skinColour) {
        setName(name);
        this.age = age;
        setGender(gender);
        setSkinColour(skinColour);

    }

    private void setSkinColour(SkinColour skinColour) {
        this.skinColour = skinColour;
    }

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
