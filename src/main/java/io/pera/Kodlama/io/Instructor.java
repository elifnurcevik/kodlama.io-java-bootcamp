package io.pera.Kodlama.io;

public class Instructor extends User {

    double salary;

    public Instructor(int id, String firstname, String lastName, String emailAddress, String password, double salary) {
        super(id, firstname, lastName, emailAddress, password);
        this.salary = salary;
    }

}
