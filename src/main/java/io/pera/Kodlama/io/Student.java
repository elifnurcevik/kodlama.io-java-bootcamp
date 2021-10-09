package io.pera.Kodlama.io;

public class Student extends User {

    String favouriteClass;

    public Student(int id, String firstname, String lastName, String emailAddress, String password, String favouriteClass) {
        super(id, firstname, lastName, emailAddress, password);
        this.favouriteClass = favouriteClass;
    }

}
