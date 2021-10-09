package io.pera.Kodlama.io;

public class StudentManager extends UserManager {

    public void deleteStudent(Student student) {
        System.out.println(student.firstname + " student deleted!");
        student.deleted = true;
    }

}
