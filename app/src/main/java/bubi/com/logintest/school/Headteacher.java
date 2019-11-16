package bubi.com.logintest.school;

public class Headteacher {
    private String name;
    private int age;
    private Experience headTeacherExperience;

    public Headteacher(String name, int age, Experience headTeacherExperience) {
        setName(name);
        setAge(age);
        setHeadTeacherExperience(headTeacherExperience);
    }


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
