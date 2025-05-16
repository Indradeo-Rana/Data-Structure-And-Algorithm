// This is the simple way to show the concept of class and object but not in used 
// because it does not have main class for constructor .

public class Animal1{ // creating simple class with "eat" method
    
    public void eat(){
        System.out.println("Animal is eating ...");
    }

    public static void main(String []args){

        Animal1 dog = new Animal1();  // creating object for the animal1 class
        dog.eat(); // accessing the objects
    }
}