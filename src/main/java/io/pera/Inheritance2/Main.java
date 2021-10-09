package io.pera.Inheritance2;

public class Main {

    public static void main(String[] args) {
        LogManager logManager = new LogManager();
        logManager.add(new EmailLogger());
    }

}

// OUTPUT
/*

Logger added
Email sent

 */

