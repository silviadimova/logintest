package bubi.com.logintest;

import org.junit.Test;


import bubi.com.logintest.school.Headteacher;
import bubi.com.logintest.school.School;
import bubi.com.logintest.school.Student;
import bubi.com.logintest.school.Teacher;


public class MyProgramm {
    private School school = new School();

    @Test
    public void testSchoolNameSaved(){

        Student student1;
        student1 = new Student();
        student1.setName("Kamran");
        student1.age = 15;
        student1.setGender('M');

        Student student2;
        student2 = new Student();
        student2.setName("Klara");
        student2.age = 16;
        student2.setGender('F');

        Student student3;
        student3 = new Student();
        student3.setName("Rony");
        student3.age = 13;
        student3.setGender('M');

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        Headteacher headteacher;
        headteacher = new Headteacher();
        school.setHeadteacher(headteacher);

        addNewStudentIfNotEnough(school.getStudentNumber());
        addNewTeacherIfZero(school.getTeacherNumber());
        printHeadteacherNameIfExisting(school.getHeadteacher().getName());


    }
    public void addNewStudentIfNotEnough(int number){
        if(number<5){
            Student student;
            student = new Student();
            school.addStudent(student);
            System.out.println(number);
        }

    }
    public void addNewTeacherIfZero(int number){
        if(number==0){
            Teacher teacher;
            teacher = new Teacher();
            school.addTeacher(teacher);
            System.out.println(number);


        }

    }
    public void printHeadteacherNameIfExisting(String headteacherName){
        if(headteacherName != null){
            System.out.println(headteacherName);
        }
        else{
            school.getHeadteacher().setName("Mr.Roberts");
        }
    }

}
