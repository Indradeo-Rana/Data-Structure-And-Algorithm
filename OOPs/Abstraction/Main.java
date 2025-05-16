
package Abstraction;

abstract class Device{
    public abstract void powerOn();
}

class Oppo extends Device{
    @Override
    public void powerOn(){
        System.out.println("Oppo phone is powered on.");
    }
}
public class Main {

    public static void main(String[] args) {
        Device myDevice = new Oppo(); // abstract class object can be created using the child class
        myDevice.powerOn(); // calling the abstract method implemented in the child class
    }
}