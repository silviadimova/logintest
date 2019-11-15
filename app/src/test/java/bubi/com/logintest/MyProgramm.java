package bubi.com.logintest;

import org.junit.Test;


import bubi.com.logintest.school.Experience;
import bubi.com.logintest.school.Headteacher;
import bubi.com.logintest.school.School;
import bubi.com.logintest.school.Student;
import bubi.com.logintest.school.Teacher;

public class MyProgramm {
    private School school = new School();

    @Test
    public void testSchoolNameSaved(){


        addNewTeachersToSchool("Mr.Robin",43, "History", new Experience());
        addNewTeachersToSchool("Mrs.Coppens",28,"Maths", new Experience());
        addNewTeachersToSchool("Mr.Chuk",45,"Geography",new Experience());

        addNewStudentsToSchool("Loik",14,'M');
        addNewStudentsToSchool("Victor",10,'M');
        addNewStudentsToSchool("Boris",15,'M');

        addNewHeadteacherToSchool("Mr.Roberts",56,new Experience());

    }
    private void addNewTeachersToSchool(String name,int age,String subject,Experience teacherExperience){
        Teacher teacher;
        teacher = new Teacher(name, age, subject, teacherExperience);
        school.addTeacher(teacher);

    }
    private void addNewStudentsToSchool(String name,int age,char gender){
        Student student;
        student = new Student(name,age,gender);
        school.addStudent(student);

    }

    private void addNewHeadteacherToSchool(String name,int age, Experience headTeacherExperience){
        Headteacher headteacher;
        headteacher = new Headteacher(name, age, headTeacherExperience);

    }
}
