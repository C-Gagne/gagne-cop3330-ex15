/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex15;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App mainApp = new App();

        String password = mainApp.getPassword();

        String outputString = genOutputString(password);
        System.out.println(outputString);
    }

    public String getPassword()
    {
        System.out.println("What is your password?");
        return in.nextLine();
    }

    public static String genOutputString(String password)
    {
        if (password.equals("abc$123"))
        {
            return "Welcome!";
        }
        else
        {
            return "I don't know you.";
        }
    }
}
