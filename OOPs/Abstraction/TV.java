package Abstraction;

abstract class LG{
    // abstract mrthod declare but implementaoin is reoponsible by child class
    abstract void turnOn();
    abstract void turnOff();
}

class TVRemote extends LG{     // TVRemote is child class of LG
    @Override
    void turnOn(){
        System.out.println("TV is turned on");
    }

    @Override
    void turnOff(){
        System.out.println("TV is turnOff.");
    }
}
public class TV {
    public static void main(String[] args) {
        LG remote = new TVRemote(); 
        remote.turnOn();
        
        // concrete class object can be created using the child class
        TVRemote remote2 = new TVRemote(); // abstract method only acccessed by the child
        remote2.turnOff();
    }
}
