package bubi.com.logintest.school;

import java.util.ArrayList;
import java.util.List;

public class School {

    private int capacity;
    private String type;
    private int foundationYear;
    private String name = new String();
    private List<Student> studentList = new ArrayList<>();
    private List<Teacher> teacherList = new ArrayList<>();
    private Headteacher headteacher;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName (){
        return name;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setName(String name) {
        this.name = name;

    }
    public void addStudent(Student newStudent){
        studentList.add(newStudent);

    }
    public void addTeacher(Teacher newTeacher){

        teacherList.add(newTeacher);
    }

    public void setHeadteacher(Headteacher newHeadteacher){
        headteacher = newHeadteacher;
    }

    public int getTeacherNumber(){
        return teacherList.size();
    }
    public int getStudentNumber(){
        return studentList.size();
    }
    public void deleteStudent(Student deletedStudent){
        studentList.remove(deletedStudent);
    }
    public void deleteTeacher( Teacher deletedTeacher){
        teacherList.remove(deletedTeacher);
    }

    public static void sayHelloSchool() {
        System.out.println("Hello school");
    }

    public Headteacher getHeadteacher() {
        return headteacher;

    }

    public void setFoundationYear(int newFoundationYear) {
        foundationYear = newFoundationYear;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public Teacher getTeacherByIndex(int index) {
        return teacherList.get(index);
    }
    public void removeTeacherByIndex(int index){
        teacherList.remove(index);
    }
    public boolean checkIfListContainsTeacher(Teacher teacher){
        return teacherList.contains(teacher);
    }
}
