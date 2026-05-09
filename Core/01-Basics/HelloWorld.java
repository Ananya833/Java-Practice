/*
-------------------------------------------------------
Topic       : Java Basics
File Name   : 01_HelloWorld.java
Purpose     : Understanding the basic structure of Java
Author      : Anu
-------------------------------------------------------

NOTES:

1. Java is a compiled language.
   -> Java code is first converted into bytecode.
   -> JVM (Java Virtual Machine) runs the bytecode.

2. Every Java program starts with a class.

3. main() method:
   -> Entry point of the program
   -> Program execution starts from here

4. System.out.println():
   -> Used to print output on console
   -> println means "print line"

SYNTAX BREAKDOWN:

public
-> Access modifier
-> Accessible from anywhere

static
-> Method belongs to class, not object

void
-> No return value

main
-> Special method name recognized by JVM

String[] args
-> Stores command line arguments

-------------------------------------------------------
*/

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }
}