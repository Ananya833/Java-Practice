/*
-------------------------------------------------------
Topic       : Variables and Data Types
File Name   : VariablesAndDataTypes.java
Purpose     : Understanding variables and primitive
              data types in Java
Author      : Anu
-------------------------------------------------------

WHAT IS A VARIABLE?

-> A variable is a container used to store data.
-> Value stored in variable can change during execution.

SYNTAX:

dataType variableName = value;

EXAMPLE:

int age = 21;

-----------------------------------------------
PRIMITIVE DATA TYPES IN JAVA
-----------------------------------------------

1. int
   -> Stores whole numbers
   -> Example: 10, 200, -5

2. double
   -> Stores decimal numbers
   -> Example: 99.5, 3.14

3. char
   -> Stores single character
   -> Written inside single quotes
   -> Example: 'A'

4. boolean
   -> Stores true or false

5. long
   -> Stores very large integers

6. float
   -> Stores decimal values
   -> Must end with 'f'

-----------------------------------------------
RULES FOR VARIABLE NAMES
-----------------------------------------------

VALID:
-> age
-> studentName
-> marks_1

INVALID:
-> 1age      (cannot start with number)
-> student-name (hyphen not allowed)
-> class     (reserved keyword)

-----------------------------------------------
IMPORTANT POINTS
-----------------------------------------------

1. Java is case-sensitive
   -> age and Age are different

2. Variable names should be meaningful

3. Use camelCase naming convention
   -> firstName
   -> totalMarks

-----------------------------------------------
COMMON MISTAKES
-----------------------------------------------

1. Forgetting semicolon

WRONG:
int age = 20

CORRECT:
int age = 20;

2. Using double quotes for char

WRONG:
char grade = "A";

CORRECT:
char grade = 'A';

-------------------------------------------------------
*/

public class VariablesAndDataTypes {

    public static void main(String[] args) {

        // Integer type
        int age = 21;

        // Double type
        double percentage = 92.5;

        // Character type
        char grade = 'A';

        // Boolean type
        boolean isPassed = true;

        // Long type
        long population = 8000000L;

        // Float type
        float price = 99.99f;

        // Printing values
        System.out.println("Age (int): " + age);
        System.out.println("Percentage (double): " + percentage);
        System.out.println("Grade (char): " + grade);
        System.out.println("Passed (boolean): " + isPassed);
        System.out.println("Population (long): " + population);
        System.out.println("Price (float): " + price);

    }
}