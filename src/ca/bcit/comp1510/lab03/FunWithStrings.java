package ca.bcit.comp1510.lab03;

/**
 * FunWithStings.
 * 
 * @author SoheeHwang
 * @version 2023
 * 
 */

import java.util.Scanner;
public class FunWithStrings {
    /**
     * Drives the program.
     * 
     * @param args command-Line arguments (unused)
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String userInput;
        System.out.println("Enter the title of your favourite book:");
        userInput = scan.nextLine();
        
        
        System.out.println("Your favourite book is " 
        + userInput + ".");
        System.out.println("The book's title is " + userInput.length() 
                + " charater(s) long.");
        System.out.println("Does the title of the book start with"
                + " the word \"The\"? " + userInput.startsWith("The"));
        userInput.toUpperCase();
        System.out.println("Question 14: " + userInput);
        
        String newUserInput = userInput.toUpperCase();
        System.out.println("Question 15: " + newUserInput);
        
        System.out.println("Upper case of the book's title: " 
        + userInput.toUpperCase());
        System.out.println("Lower case of the book's title: " 
        + userInput.toLowerCase());
        String trimmedUserInput = userInput.trim(); 
        System.out.println("The length of trimmedUserInput variable is " 
        + trimmedUserInput.length());
        //a. Nothing but tabs
        //b. Nothing but spaces
        //c. Spaces, then a word, then spaces
        //d. Spaces, then some words, then more spaces
        
        System.out.println("user typed: " + userInput);
        System.out.println("fully trimmed: " + userInput.trim());
        System.out.println("in lower case:" + userInput.toLowerCase());
        System.out.println("with the first and last letters capitalized: " 
        + userInput.substring(0, 1).toUpperCase()
        + userInput.substring(1, userInput.length() - 1)
        + userInput.substring(userInput.length() - 1,
                userInput.length()).toUpperCase());
        
        scan.close();
    }

}
