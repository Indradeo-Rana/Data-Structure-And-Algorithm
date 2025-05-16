 // Here we are creating separate class to increase the readability
 
 class Animal6 {
    void eat(){
        System.out.println("Eating ...");
    }
    
}

public class MainApp {
    public static void main(String[] args) {
        Animal6 ant = new Animal6();
        ant.eat();
    }
}
