
/*
 Method Overriding  (Runtime polymorphism)
Method overriding occurs in a subclass when a method has the same name, parameters, 
and return type as a method in its superclass. This allows a subclass to provide a 
specific implementation for a method that is already 
defined in its parent class
 */

package Plymorphism;
    class Animal{
        public void sound(){
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal{
        @Override
        public void sound(){
            System.out.println("Dogs barks");
        }


        // Method to call the parent class's sound() method

        public void parentSound(){
            super.sound();
        }
    }
public class Overriding {
    public static void main(String[] args) {
        Animal myDog  =  new Dog(); // Create a Dog object
        myDog.sound(); // Call the sound method on the Dog object

        // myDog.parentSound(); // Call the parent class's sound() method
        // The following line will cause a compile-time error because the reference type is Animal

        Animal dog = new Animal(); // Create a Dog object
        dog.sound(); // Call the sound method on the Dog object

        // dog.parentSound();         // The following line will cause a compile-time error because the reference type is Animal

        
        Dog dog1 = new Dog(); // Create a Dog object
        System.out.println("This dog reference is calling the parent class method");
        dog1.parentSound(); // Call the parent class's sound() method
    }
}
