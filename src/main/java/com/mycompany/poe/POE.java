/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.poe;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class POE {

    public static void main(String[] args) {
        //Declaration

        Scanner scanner = new Scanner(System.in);

//          registerUser second = new registerUser();
        registerUser myregisterUserObj = new registerUser();
        myregisterUserObj.validateUsername();

        // Input username and password
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();

        System.out.println("Enter Password: ");
        String password = scanner.nextLine();

        // Input first name and last name for login greeting
        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();

    }
}
