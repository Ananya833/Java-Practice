/*
-------------------------------------------------------
Topic       : Assignment Operators
File Name   : AssignmentOperators.java
Purpose     : Understanding assignment operators
              in Java
Author      : Anu
-------------------------------------------------------

WHAT ARE ASSIGNMENT OPERATORS?

-> Assignment operators are used to assign
   values to variables.

-------------------------------------------------------
BASIC ASSIGNMENT OPERATOR
-------------------------------------------------------

=  -> Assigns value

Example:
int x = 10;

-------------------------------------------------------
COMPOUND ASSIGNMENT OPERATORS
-------------------------------------------------------

+=  -> Add and assign
-=  -> Subtract and assign
*=  -> Multiply and assign
/=  -> Divide and assign
%=  -> Modulus and assign

-------------------------------------------------------
EXAMPLES
-------------------------------------------------------

x += 5;

Same as:
x = x + 5;

-----------------------------------------------

x *= 2;

Same as:
x = x * 2;

-------------------------------------------------------
IMPORTANT POINTS
-------------------------------------------------------

1. Compound assignment makes code shorter
   and cleaner.

2. Frequently used in:
   -> loops
   -> counters
   -> accumulators
   -> calculations

3. Variable gets updated automatically.

-------------------------------------------------------
COMMON MISTAKES
-------------------------------------------------------

1. Confusing '=' with '=='

=  -> Assignment
== -> Comparison

-----------------------------------------------

2. Forgetting variable update

Example:

x + 5;

This does NOT update x.

CORRECT:
x = x + 5;

OR:
x += 5;

-------------------------------------------------------
*/

public class AssignmentOperators {

    public static void main(String[] args) {

        int number = 10;

        System.out.println("Initial Value: " + number);

        // Addition assignment
        number += 5;

        System.out.println("\nAfter += 5 : " + number);

        // Subtraction assignment
        number -= 3;

        System.out.println("After -= 3 : " + number);

        // Multiplication assignment
        number *= 2;

        System.out.println("After *= 2 : " + number);

        // Division assignment
        number /= 4;

        System.out.println("After /= 4 : " + number);

        // Modulus assignment
        number %= 3;

        System.out.println("After %= 3 : " + number);

    }
}