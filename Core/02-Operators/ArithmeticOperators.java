/*
-------------------------------------------------------
Topic       : Arithmetic Operators
File Name   : ArithmeticOperators.java
Purpose     : Understanding arithmetic operations
              in Java
Author      : Anu
-------------------------------------------------------

WHAT ARE OPERATORS?

-> Operators are symbols used to perform
   operations on variables and values.

Example:
+, -, *, /, %

-------------------------------------------------------
ARITHMETIC OPERATORS
-------------------------------------------------------

+   -> Addition
-   -> Subtraction
*   -> Multiplication
/   -> Division
%   -> Modulus (Remainder)

-------------------------------------------------------
IMPORTANT POINTS
-------------------------------------------------------

1. Division between integers gives integer result

Example:
10 / 3 = 3

Decimal part is removed.

-----------------------------------------------

2. Division with double gives decimal result

Example:
10.0 / 3 = 3.333...

-----------------------------------------------

3. Modulus Operator (%)

-> Returns remainder after division

Example:
10 % 3 = 1

Commonly used for:
-> Even/Odd checking
-> Digit extraction
-> Logic building

-------------------------------------------------------
OPERATOR PRECEDENCE
-------------------------------------------------------

Order of execution:

1. ()
2. *, /, %
3. +, -

Example:
2 + 3 * 4 = 14

NOT 20

-------------------------------------------------------
COMMON MISTAKES
-------------------------------------------------------

1. Expecting decimal result from integer division

WRONG EXPECTATION:
5 / 2 = 2.5

ACTUAL OUTPUT:
2

CORRECT:
5.0 / 2 = 2.5

-------------------------------------------------------
*/

public class ArithmeticOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Addition
        int sum = a + b;

        // Subtraction
        int difference = a - b;

        // Multiplication
        int product = a * b;

        // Division
        int quotient = a / b;

        // Modulus
        int remainder = a % b;

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        System.out.println("\n----- ARITHMETIC OPERATIONS -----");

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Decimal division
        double decimalResult = 10.0 / 3;

        System.out.println("\nDecimal Division: " + decimalResult);

        // Operator precedence example
        int result = 2 + 3 * 4;

        System.out.println("\nOperator Precedence Result: " + result);

    }
}