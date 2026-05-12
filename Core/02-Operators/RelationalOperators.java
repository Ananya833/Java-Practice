/*
-------------------------------------------------------
Topic       : Relational Operators
File Name   : RelationalOperators.java
Purpose     : Understanding comparison operators
              in Java
Author      : Anu
-------------------------------------------------------

WHAT ARE RELATIONAL OPERATORS?

-> Relational operators are used to compare values.

-> Result is always:
   true or false

-> Return type is boolean.

-------------------------------------------------------
RELATIONAL OPERATORS
-------------------------------------------------------

==   -> Equal to
!=   -> Not equal to
>    -> Greater than
<    -> Less than
>=   -> Greater than or equal to
<=   -> Less than or equal to

-------------------------------------------------------
IMPORTANT POINTS
-------------------------------------------------------

1. Result of comparison is boolean

Example:
5 > 3

Output:
true

-----------------------------------------------

2. == checks equality

Example:
10 == 10

Output:
true

-----------------------------------------------

3. != checks inequality

Example:
10 != 5

Output:
true

-------------------------------------------------------
COMMON MISTAKES
-------------------------------------------------------

1. Confusing '=' with '=='

=   -> Assignment operator
==  -> Comparison operator

WRONG:
if(a = b)

CORRECT:
if(a == b)

-----------------------------------------------

2. Comparing strings using ==

WRONG:
name == "Anu"

For strings, use:
name.equals("Anu")

(Will study later in Strings topic)

-------------------------------------------------------
*/

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        System.out.println("\n----- RELATIONAL OPERATIONS -----");

        // Equal to
        System.out.println("a == b : " + (a == b));

        // Not equal to
        System.out.println("a != b : " + (a != b));

        // Greater than
        System.out.println("a > b : " + (a > b));

        // Less than
        System.out.println("a < b : " + (a < b));

        // Greater than or equal to
        System.out.println("a >= b : " + (a >= b));

        // Less than or equal to
        System.out.println("a <= b : " + (a <= b));

    }
}