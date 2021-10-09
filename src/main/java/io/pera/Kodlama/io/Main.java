package io.pera.Kodlama.io;

public class Main {

    public static void main(String[] args) {

        Instructor enginInstructor = new Instructor(1, "Engin", "Demirog", "ed@***", "kodlama.io.555", 15650);

        Student elifStudent = new Student(2, "Elif Nur", "Cevik", "ec@***", "elf.cvk.000", "Java Bootcamp");

        InstructorManager instructorManager = new InstructorManager(enginInstructor);
        instructorManager.teach(elifStudent);

        StudentManager studentManager = new StudentManager();
        studentManager.deleteStudent(elifStudent);

        instructorManager.resetPassword();
    }

}

// OUTPUT
/*

Engin instructor teaches Elif Nur student
Elif Nur student deleted!
Your password has been reset

 */