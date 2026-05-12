/*
-------------------------------------------------------
Topic       : Increment and Decrement Operators
File Name   : IncrementDecrement.java
Purpose     : Understanding increment and decrement
              operations in Java
Author      : Anu
-------------------------------------------------------

WHAT ARE INCREMENT/DECREMENT OPERATORS?

-> Used to increase or decrease value by 1.

-------------------------------------------------------
OPERATORS
-------------------------------------------------------

++  -> Increment operator
--  -> Decrement operator

-------------------------------------------------------
TYPES OF INCREMENT
-------------------------------------------------------

1. Pre-Increment
   -> ++x

2. Post-Increment
   -> x++

-------------------------------------------------------
TYPES OF DECREMENT
-------------------------------------------------------

1. Pre-Decrement
   -> --x

2. Post-Decrement
   -> x--

-------------------------------------------------------
PRE-INCREMENT
-------------------------------------------------------

Value increases FIRST,
then expression executes.

Example:

int x = 5;
int y = ++x;

Step 1:
x becomes 6

Step 2:
y gets 6

-----------------------------------------------
OUTPUT:
x = 6
y = 6

-------------------------------------------------------
POST-INCREMENT
-------------------------------------------------------

Expression executes FIRST,
then value increases.

Example:

int x = 5;
int y = x++;

Step 1:
y gets 5

Step 2:
x becomes 6

-----------------------------------------------
OUTPUT:
x = 6
y = 5

-------------------------------------------------------
IMPORTANT POINTS
-------------------------------------------------------

1. Mostly used in:
   -> loops
   -> counters
   -> array traversal

2. Pre and post operators behave differently
   inside expressions.

3. When used alone:

x++;
++x;

Both increase value by 1.

Difference matters mainly inside expressions.

-------------------------------------------------------
COMMON MISTAKES
-------------------------------------------------------

1. Assuming x++ and ++x are always same

NOT true inside expressions.

2. Writing confusing expressions

BAD PRACTICE:
int result = x++ + --y - ++z;

Avoid overly complex expressions.

-------------------------------------------------------
*/

public class IncrementDecrement {

    public static void main(String[] args) {

        // -----------------------------------
        // PRE-INCREMENT
        // -----------------------------------

        int a = 5;

        int preIncrement = ++a;

        System.out.println("----- PRE-INCREMENT -----");

        System.out.println("Value of a: " + a);
        System.out.println("Value of preIncrement: " + preIncrement);

        // -----------------------------------
        // POST-INCREMENT
        // -----------------------------------

        int b = 5;

        int postIncrement = b++;

        System.out.println("\n----- POST-INCREMENT -----");

        System.out.println("Value of b: " + b);
        System.out.println("Value of postIncrement: " + postIncrement);

        // -----------------------------------
        // PRE-DECREMENT
        // -----------------------------------

        int c = 10;

        int preDecrement = --c;

        System.out.println("\n----- PRE-DECREMENT -----");

        System.out.println("Value of c: " + c);
        System.out.println("Value of preDecrement: " + preDecrement);

        // -----------------------------------
        // POST-DECREMENT
        // -----------------------------------

        int d = 10;

        int postDecrement = d--;

        System.out.println("\n----- POST-DECREMENT -----");

        System.out.println("Value of d: " + d);
        System.out.println("Value of postDecrement: " + postDecrement);

    }
}