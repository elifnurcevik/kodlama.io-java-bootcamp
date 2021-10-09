package io.pera.PolymorphismDemo;

public class Main {
    public static void main(String[] args) {
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
        for (BaseLogger logger : loggers) {
            logger.log("Log message");
        }
    }

}

// OUTPUT
/*

5
9

 */

