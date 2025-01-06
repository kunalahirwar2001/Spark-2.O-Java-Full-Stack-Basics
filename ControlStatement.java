// In java we can write any number of s`tatement which are executed in sequence order by default.
// But in some cases we need to change the flow of execution of the program. This is done by using control statements.
// Control statements are used to control the flow of execution of the program.

// There are three types of control statements in java:
// 1. Selection statements
// Selection statements are used to select a particular statement or a block of statements to be executed.

// 2. Iteration statements
// Iteration statements are used to execute a block of statements repeatedly.

// 3. Jump statements
// Jump statements are used to transfer the control of the program to a different part of the program.

// 4. Switch statement
// Switch statement is used to select one of the many code blocks to be executed.

public class ControlStatement {
    public static void main(String[] args) {

        // Selection statements

        // 1. if statement
        // if statement is used to check a condition and execute a block of code if the
        // condition is true.
        // Syntax:
        // if(condition){
        // // code to be executed if the condition is true
        // }

        // Example:
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }
        // Output will be: x is greater than 5

        // 2. if-else statement
        // if-else statement is used to execute a block of code if the condition is true
        // and another block of code if the condition is false.
        // Syntax:
        // if(condition){
        // // code to be executed if the condition is true
        // }else{
        // // code to be executed if the condition is false
        // }

        // Example:
        int y = 10;
        if (y > 5) {
            System.out.println("y is greater than 5");
        } else {
            System.out.println("y is less than or equal to 5");
        }
        // Output will be: y is greater than 5

        // 3. if-else-if statement
        // if-else-if statement is used to execute one block of code if one of the
        // several conditions is true.
        // Syntax:
        // if(condition1){
        // // code to be executed if condition1 is true
        // }else if(condition2){
        // // code to be executed if condition2 is true
        // }else{
        // // code to be executed
        // }

        // Example:
        int z = 10;
        if (z > 5) {
            System.out.println("z is greater than 5");
        } else if (z < 5) {
            System.out.println("z is less than 5");
        } else {
            System.out.println("z is equal to 5");
        }
        // Output will be: z is greater than 5

        // 4. nested if statement
        // nested if statement is used to check another condition if a certain condition
        // is true.
        // Syntax:
        // if(condition1){
        // // code to be executed if condition1 is true
        // if(condition2){
        // // code to be executed if condition2 is true
        // }
        // }

        // Example:
        int a = 10;
        int b = 20;
        if (a == 10) {
            if (b == 20) {
                System.out.println("a is 10 and b is 20");
            }
        }
        // Output will be: a is 10 and b is 20

        // Iteration statements

        // 1. for loop
        // for loop is used to execute a block of code a certain number of times.
        // Syntax:
        // for(initialization; condition; increment/decrement){
        // // code to be executed
        // }

        // Example:
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // Output will be:
        // 0
        // 1
        // 2
        // 3
        // 4

        // 2. while loop
        // while loop is used to execute a block of code repeatedly as long as the
        // condition is true.
        // Syntax:
        // while(condition){
        // // code to be executed
        // }

        // Example:
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }
        // Output will be:
        // 0
        // 1
        // 2
        // 3
        // 4

        // 3. do-while loop
        // do-while loop is used to execute a block of code repeatedly as long as the
        // condition is true.
        // Syntax:
        // do{
        // // code to be executed
        // }while(condition);

        // Example:
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 5);
        // Output will be:
        // 0
        // 1
        // 2
        // 3
        // 4

        // 4. nested loop
        // nested loop is a loop inside another loop.
        // Syntax:
        // for(initialization; condition; increment/decrement){
        // for(initialization; condition; increment/decrement){
        // // code to be executed
        // }
        // }

        // Example:
        for (int l = 0; l < 3; l++) {
            for (int m = 0; m < 3; m++) {
                System.out.println(l + " " + m);
            }
        }
        // Output will be:
        // 0 0
        // 0 1
        // 0 2
        // 1 0
        // 1 1
        // 1 2
        // 2 0
        // 2 1
        // 2 2

        // Jump statements
        // There are three types of jump statements in java:
        // 1. break
        // 2. continue
        // 3. return

        // 1. break
        // break statement is used to terminate the loop or switch statement.
        // Syntax:
        // break;
        // Example:
        for (int n = 0; n < 5; n++) {
            if (n == 3) {
                break;
            }
            System.out.println(n);
        }
        // Output will be:
        // 0
        // 1
        // 2
        // 3

        // 2. continue
        // continue statement is used to skip the current iteration of a loop.
        // Syntax:
        // continue;

        // Example:
        for (int o = 0; o < 5; o++) {
            if (o == 3) {
                continue;
            }
            System.out.println(o);
        }
        // Output will be:
        // 0
        // 1
        // 2
        // 4

        // 3. return
        // return statement is used to return a value from a method.
        // Syntax:
        // return value;

        // Example:
        // System.out.println(sum(10, 20));
        // Output will be: 30
        // public static int sum(int a, int b) {
        // return a + b;
        // }

        // Switch statement
        // switch statement is used to execute a block of code based on the value of a
        // variable.
        // Syntax:
        // switch(expression){
        // case value1:
        // // code to be executed if expression is equal to value1
        // break;
        // case value2:
        // // code to be executed if expression is equal to value2
        // break;
        // default:
        // // code to be executed if expression is not equal to any value
        // }

        // Example:
        int p = 2;
        switch (p) {
            case 1:
                System.out.println("p is 1");
                break;

            case 2:
                System.out.println("p is 2");
                break;

            default:
                System.out.println("p is neither 1 nor 2");
        }
        // Output will be: p is 2
    }
}
