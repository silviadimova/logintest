package bubi.com.logintest.school;

public class Teacher {

    private int age;
    private String name;
    private String subject;
    private Experience teacherExperience;

    public Teacher(String name, int age, String subject, Experience teacherExperience) {
        setName(name);
        setAge(age);
        setSubject(subject);
        setTeacherExperience(teacherExperience);
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
      name=newName;

    }
    public void setSubject(String newSubject){
        subject = newSubject;
    }

    public void setTeacherExperience(Experience newTeacherExperience){
        teacherExperience = newTeacherExperience;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
