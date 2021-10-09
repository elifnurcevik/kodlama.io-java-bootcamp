package io.pera.Kodlama.io;

public class User {

    public User(int id, String firstname, String lastName, String emailAddress, String password) {
        super();
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    int id;
    String firstname;
    String lastName;
    boolean deleted = false;
    String emailAddress;
    String password;

}
