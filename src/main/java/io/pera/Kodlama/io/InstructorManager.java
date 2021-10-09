package io.pera.Kodlama.io;

public class InstructorManager extends UserManager {

    private Instructor instructor;

    public InstructorManager(Instructor instructor) {
        this.instructor = instructor;
    }

    public void teach(Student student) {
        System.out.println(instructor.firstname + " instructor teaches " + student.firstname + " student");
    }

}
