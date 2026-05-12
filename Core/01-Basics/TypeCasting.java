/*
-------------------------------------------------------
Topic       : Type Casting
File Name   : TypeCasting.java
Purpose     : Understanding conversion of one data
              type into another
Author      : Anu
-------------------------------------------------------

WHAT IS TYPE CASTING?

-> Type casting means converting one data type
   into another data type.

-------------------------------------------------------
TYPES OF TYPE CASTING
-------------------------------------------------------

1. WIDENING CASTING (Implicit Casting)

-> Smaller data type converts into larger type
-> Done automatically by Java

EXAMPLE:
int -> long
float -> double
char -> int

-----------------------------------------------

2. NARROWING CASTING (Explicit Casting)

-> Larger data type converts into smaller type
-> Must be done manually

EXAMPLE:
double -> int
long -> short

-----------------------------------------------
WIDENING CASTING
-----------------------------------------------

No data loss occurs.

Example:
int num = 10;
double value = num;

OUTPUT:
10.0

-----------------------------------------------
NARROWING CASTING
-----------------------------------------------

Data loss may occur.

Example:
double num = 9.8;
int value = (int) num;

OUTPUT:
9

Decimal part gets removed.

-----------------------------------------------
IMPORTANT POINTS
-----------------------------------------------

1. Implicit Casting
-> Automatic
-> Safe conversion

2. Explicit Casting
-> Manual conversion
-> Risk of data loss

3. char can convert into int
-> Java stores characters using ASCII/Unicode values

Example:
char ch = 'A';

ASCII value of A = 65

-----------------------------------------------
COMMON MISTAKES
-----------------------------------------------

WRONG:
double num = 10.5;
int x = num;

ERROR:
Possible lossy conversion from double to int

CORRECT:
int x = (int) num;

-------------------------------------------------------
*/

public class TypeCasting {

    public static void main(String[] args) {

        // -----------------------------------
        // WIDENING CASTING
        // -----------------------------------

        int number = 25;

        // int automatically converts to double
        double convertedNumber = number;

        System.out.println("Integer Value: " + number);
        System.out.println("Converted to Double: " + convertedNumber);

        // -----------------------------------
        // NARROWING CASTING
        // -----------------------------------

        double price = 99.99;

        // Manual conversion
        int roundedPrice = (int) price;

        System.out.println("\nOriginal Double Value: " + price);
        System.out.println("Converted to Integer: " + roundedPrice);

        // -----------------------------------
        // CHAR TO INT
        // -----------------------------------

        char grade = 'A';

        int asciiValue = grade;

        System.out.println("\nCharacter: " + grade);
        System.out.println("ASCII Value: " + asciiValue);

    }
}