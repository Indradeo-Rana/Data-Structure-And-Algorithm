class Animal7 { // creating first class Animal
    void eat(){
        System.out.println("Eating ...");
    }
    
}

class Bird{  //creating second class Bird
    void fly(){
        System.out.println("they can fly");
    }
}

public class MainApp2 {
    public static void main(String[] args) {
        Animal7 ant = new Animal7();
        ant.eat();
        
        Bird spqrrow = new Bird();
        spqrrow.fly();
    }
}
 
