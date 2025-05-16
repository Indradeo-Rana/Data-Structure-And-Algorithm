public class Animal3 {
    
    public void eat(){
        System.out.println("is eating ..");
    }
    public void run(){
        System.out.println("is running ..");
    }
    public static void main(String[] args) {  //// both method can be accessed by different object like cat and rat
        
        Animal3 cat = new Animal3();      // creating multiple object
        Animal3 rat = new Animal3();

        cat.eat();  // accessing the methods
        rat.run();
        cat.run();
    }
}
