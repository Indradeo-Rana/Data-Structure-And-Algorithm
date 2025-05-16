// here is same but a class has more than 2 methods --> eat and run

public class Animal2 {
    
    public void eat(){  // first method
        System.out.println("Animal is eating ...");
    }
    
    public static void main(String []args){

        Animal2 dog = new Animal2(); // both method can be accessed by single object
        dog.eat();
        dog.run();
    }

    public void run(){  // Second method
        System.out.println("Animal is running..");
    }
}
