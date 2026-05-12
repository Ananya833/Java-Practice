/*
-------------------------------------------------------
Topic       : Character Operations
File Name   : CharacterOperations.java
Purpose     : Understanding character arithmetic
              and ASCII/Unicode behavior in Java
Author      : Anu
-------------------------------------------------------

WHAT IS A CHAR?

-> char stores a single character.

Example:
'A'
'B'
'7'

-------------------------------------------------------
IMPORTANT CONCEPT
-------------------------------------------------------

Characters are internally stored as numbers
using ASCII/Unicode values.

Example:

'A' = 65
'B' = 66
'a' = 97

-------------------------------------------------------
CHARACTER OPERATIONS
-------------------------------------------------------

Java allows arithmetic operations on chars.

Example:

char ch = 'A';

System.out.println(ch + 1);

OUTPUT:
66

Because:
'A' = 65
65 + 1 = 66

-------------------------------------------------------
TYPE PROMOTION
-------------------------------------------------------

During arithmetic operations,
char automatically converts into int.

Example:

char ch = 'A';

int result = ch + 2;

-----------------------------------------------
OUTPUT:
67

-------------------------------------------------------
IMPORTANT POINTS
-------------------------------------------------------

1. char behaves like integer in arithmetic.

2. Useful in:
   -> encryption
   -> character shifting
   -> ASCII conversions
   -> pattern logic

3. Explicit casting needed when converting
   back to char.

-------------------------------------------------------
COMMON MISTAKES
-------------------------------------------------------

WRONG:
char next = ch + 1;

ERROR:
Possible lossy conversion from int to char

CORRECT:
char next = (char)(ch + 1);

-------------------------------------------------------
*/

public class CharacterOperations {

    public static void main(String[] args) {

        char letter = 'A';

        System.out.println("Character: " + letter);

        // ASCII value
        int asciiValue = letter;

        System.out.println("ASCII Value: " + asciiValue);

        // Character arithmetic
        int nextValue = letter + 1;

        System.out.println("After Adding 1: " + nextValue);

        // Convert back to character
        char nextCharacter = (char)(letter + 1);

        System.out.println("Next Character: " + nextCharacter);

        // More examples
        System.out.println("\nCharacter Arithmetic:");

        System.out.println("'A' + 2 = " + ('A' + 2));

        System.out.println("'a' + 1 = " + ('a' + 1));

        System.out.println("'0' + 1 = " + ('0' + 1));

    }
}