package io.pera.MethodOverloding;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2, 3));
        System.out.println(calculator.sum(2, 3, 4));
    }

}

// OUTPUT
/*

5
9

 */
