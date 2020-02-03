package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "A Simple Java Application - My 1st step to intuit !";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
