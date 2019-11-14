package bubi.com.logintest.school;

public class Headteacher {
    private String name;
    private int age;
    private Experience headTeacherExperience;


    public void setHeadTeacherExperience (Experience headTeacherExp){
        headTeacherExperience = headTeacherExp;

    }
    public void setName (String headteacherName){
        name=headteacherName;
    }

    public String getName() {
        return name;

    }

    public void setAge(int age) {
        this.age = age;

    }
}
