package Interface;

// first interface
 interface Vehicle {
    void startEngine(); // abstract method
    default void honk() { // default method
        System.out.println("Vehicle is honking!");
    }
}


// Second interface
interface Electric {
    void chargeBattery(); // Abstract method
    default void ecoMode() { // Default method
        System.out.println("Eco mode activated!");
    }
}

 // class implementing multiple interfaces
  class Car implements Vehicle, Electric{
    @Override
    public void startEngine() { // Implementing the abstract method from Vehicle interface(1st interface)
        System.out.println("Engine started!");
    }

    @Override
    public void chargeBattery() {   // Implementing the abstract method from Electric interface(2nd interface)
        System.out.println("Battery charging...");
    }

    // Overriding the default method from Vehicle interface
    @Override
    public void honk() {
        System.out.println("Car is honking!");
    }

    // Overriding the default method from Electric interface
    @Override
    public void ecoMode() {
        System.out.println("Car is in eco mode!");
    }
 }
public class Interface1 {
    public static void main(String[] args) {
        
        Car myCar = new Car(); // Create a Car object

        // Calling methods from Vehicle interface
        myCar.startEngine(); // Call the startEngine method
        myCar.honk(); // Call the honk method from Vehicle interface
        
        // Calling methods from Electric interface
        myCar.chargeBattery(); // Call the chargeBattery method
        myCar.ecoMode(); // Call the ecoMode method from Electric interface
    }
}
