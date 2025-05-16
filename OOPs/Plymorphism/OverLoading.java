/*
Method overloading and method overriding are two key concepts in Java that facilitate polymorphism.
Method Overloading  (Compile-time polymorphism) 

Method overloading occurs within the same class when multiple methods share the same name but 
have different parameter lists. The difference in parameters can be in the number of parameters, 
the data types of parameters, or the order of parameters. The return type of the methods does not
play a role in overloading.
 */

package Plymorphism;

public class OverLoading {

    public static void main(String[] args) {
        add(5, 10.5); // Calls the first method

        System.out.println(add(2,3)); // Calls the second method
    }

    // declaring the shared method name
    public static int add(int a, int b) {   // declare the second method
        return a + b;
    }
    public static void add(int  c , double d){   // declare the first method
        System.out.println("The sum of two integers is: " + (c + d));
    }
}
