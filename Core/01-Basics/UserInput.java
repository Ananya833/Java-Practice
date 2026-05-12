/*
-------------------------------------------------------
Topic       : User Input in Java
File Name   : UserInput.java
Purpose     : Understanding how to take input from user
Author      : Anu
-------------------------------------------------------

WHAT IS USER INPUT?

-> User input allows program to accept values
   during execution.

-> Java uses Scanner class for input handling.

-------------------------------------------------------
SCANNER CLASS
-------------------------------------------------------

-> Scanner is present in:
   java.util package

IMPORT STATEMENT:

import java.util.Scanner;

-------------------------------------------------------
COMMONLY USED METHODS
-------------------------------------------------------

nextInt()      -> Reads integer
nextDouble()   -> Reads decimal number
nextFloat()    -> Reads float value
next()         -> Reads single word
nextLine()     -> Reads complete sentence
nextBoolean()  -> Reads true/false

-------------------------------------------------------
IMPORTANT POINTS
-------------------------------------------------------

1. Scanner object is required

SYNTAX:
Scanner sc = new Scanner(System.in);

2. System.in
-> Represents keyboard input

3. close() method
-> Used to close scanner object

-------------------------------------------------------
COMMON MISTAKE
-------------------------------------------------------

PROBLEM:
nextInt() + nextLine()

Example:

int age = sc.nextInt();
String name = sc.nextLine();

ISSUE:
nextLine() gets skipped because Enter key
remains in input buffer.

SOLUTION:
Use extra nextLine()

Example:

int age = sc.nextInt();
sc.nextLine();

String name = sc.nextLine();

-------------------------------------------------------
*/

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Taking double input
        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        // Taking boolean input
        System.out.print("Are you passed? (true/false): ");
        boolean isPassed = sc.nextBoolean();

        // Printing output
        System.out.println("\n----- USER DETAILS -----");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
        System.out.println("Passed: " + isPassed);

        // Closing scanner
        sc.close();

    }
}