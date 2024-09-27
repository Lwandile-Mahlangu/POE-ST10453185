/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author RC_Student_lab
 */
public class registerUser {
   private String firstName;
   private String lastName;
    private String username;
   private String password;
   
   
      
   //Getters
   public String getUsername(){
       return username;
   }
    public String getPassword(){
       return password;
    }
    public String getFirstName(){
       return firstName;
    }
     
    public String getLastName(){
       return lastName;
    }
    
    // Function to validate username
    public static String validateUsername(String username) {
        if (username.contains("_") && username.length() <= 5) {
            return "Username successfully captured.";
        } else {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }
    }
   // Function to validate password
    public static Boolean checkPassword(String password) {
        
        String capitalLetterPattern = ".*[A-Z].*";
        String numberPattern = ".*[0-9].*";
        String specialCharPattern = ".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*";
        
        if (password.length() >= 8 
                
            && password.equals(capitalLetterPattern)
            && password.equals(numberPattern)
            && password.equals(specialCharPattern)) {
            System.out.println("Password successfully captured.");
            return true;
        } else {
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");
            
            return false;
        }
    }  
    public Boolean loginUser(){
        if(
            firstName.equals(firstName)
                    && lastName.equals(lastName)
                    && password.equals(password)
                    && username.equals(username));
        
        System.out.println("Welcome "+ firstName +" "+ lastName+" it is great to see you again" );
        return true;
    }
    
}

