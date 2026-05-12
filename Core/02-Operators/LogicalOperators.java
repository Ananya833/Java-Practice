/*
-------------------------------------------------------
Topic       : Logical Operators
File Name   : LogicalOperators.java
Purpose     : Understanding logical operations
              in Java
Author      : Anu
-------------------------------------------------------

WHAT ARE LOGICAL OPERATORS?

-> Logical operators are used to combine
   multiple conditions.

-> Result is always:
   true or false

-------------------------------------------------------
LOGICAL OPERATORS
-------------------------------------------------------

&&   -> Logical AND
||   -> Logical OR
!    -> Logical NOT

-------------------------------------------------------
1. LOGICAL AND (&&)
-------------------------------------------------------

Returns true ONLY if both conditions are true.

Example:

(5 > 3 && 10 > 8)

true && true = true

-----------------------------------------------

2. LOGICAL OR (||)
-----------------------------------------------

Returns true if at least one condition is true.

Example:

(5 > 10 || 8 > 3)

false || true = true

-----------------------------------------------

3. LOGICAL NOT (!)
-----------------------------------------------

Reverses boolean value.

true becomes false
false becomes true

Example:

!(5 > 3)

Output:
false

-------------------------------------------------------
IMPORTANT POINTS
-------------------------------------------------------

1. Logical operators work with boolean values.

2. Mostly used in:
   -> if statements
   -> loops
   -> validations
   -> authentication systems

3. Complex conditions can be created using
   multiple logical operators.

-------------------------------------------------------
COMMON MISTAKES
-------------------------------------------------------

1. Confusing '&' with '&&'

&  -> Bitwise AND
&& -> Logical AND

2. Confusing '|' with '||'

|  -> Bitwise OR
|| -> Logical OR

3. Forgetting brackets in complex conditions

WRONG:
a > b && c < d || x == y

BETTER:
(a > b && c < d) || (x == y)

Improves readability.

-------------------------------------------------------
*/

public class LogicalOperators {

    public static void main(String[] args) {

        int age = 20;
        int marks = 85;

        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        System.out.println("\n----- LOGICAL OPERATIONS -----");

        // Logical AND
        boolean andResult = (age >= 18 && marks >= 40);

        System.out.println("Eligible using AND: " + andResult);

        // Logical OR
        boolean orResult = (age < 18 || marks > 80);

        System.out.println("Condition using OR: " + orResult);

        // Logical NOT
        boolean notResult = !(marks < 40);

        System.out.println("NOT Result: " + notResult);

        // Complex condition
        boolean finalResult =
                (age >= 18 && marks >= 75);

        System.out.println("Final Eligibility: " + finalResult);

    }
}