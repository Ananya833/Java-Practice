/*
-------------------------------------------------------
Topic       : String Concatenation
File Name   : StringConcatenation.java
Purpose     : Understanding string joining and
              '+' operator behavior in Java
Author      : Anu
-------------------------------------------------------

WHAT IS CONCATENATION?

-> Concatenation means joining strings together.

-> Java uses '+' operator for concatenation.

-------------------------------------------------------
EXAMPLES
-------------------------------------------------------

"Hello" + " World"

OUTPUT:
Hello World

-----------------------------------------------

String name = "Anu";

"Hello " + name

OUTPUT:
Hello Anu

-------------------------------------------------------
IMPORTANT POINTS
-------------------------------------------------------

1. '+' works differently with strings

-> Numeric values:
   Performs addition

-> Strings:
   Performs concatenation

-----------------------------------------------

2. Once Java encounters a String,
   remaining values are treated as strings.

Example:

"Java" + 5 + 3

OUTPUT:
Java53

-----------------------------------------------

3. Brackets affect evaluation

Example:

5 + 3 + "Java"

OUTPUT:
8Java

Because:
5 + 3 happens first

-----------------------------------------------

(5 + 3) + "Java"

OUTPUT:
8Java

-----------------------------------------------

"Java" + (5 + 3)

OUTPUT:
Java8

-------------------------------------------------------
COMMON MISTAKES
-------------------------------------------------------

1. Assuming left-to-right always means addition

WRONG EXPECTATION:
"Result: " + 5 + 3 = Result: 8

ACTUAL OUTPUT:
Result: 53

CORRECT:
"Result: " + (5 + 3)

-------------------------------------------------------
*/

public class StringConcatenation {

    public static void main(String[] args) {

        String firstName = "Anu";
        String lastName = "Sharma";

        // Simple concatenation
        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);

        // Number addition
        System.out.println("\n5 + 3 = " + (5 + 3));

        // String concatenation with numbers
        System.out.println("Java" + 5 + 3);

        // Addition before concatenation
        System.out.println(5 + 3 + "Java");

        // Using brackets
        System.out.println("Java" + (5 + 3));

        // Mixed expression
        System.out.println("Result: " + (10 * 2));

    }
}