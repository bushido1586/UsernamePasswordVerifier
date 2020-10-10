package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        String username= "admin";
        String password="adminuser";
        String enteredUsername;
        String enteredPassword;
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Enter username: ");
        enteredUsername= reader.readLine();
        if(username.equals(enteredUsername)){
            System.out.println("Enter password: ");
            enteredPassword= reader.readLine();
            if(enteredPassword.equals(password)){
                System.out.println("Logged in, Welcome admin");
            }else {
                System.out.println("Incorrect Password");
            }
        }else {
            System.out.println("Invalid Username");
        }
    }
}
