
public class Animal4 {

    public void eat(String name, String dish){  // this class method has a parameter
        System.out.println(name+" is eating.. "+dish);
    }
    public void run(String name){  // this class method has a parameter
        System.out.println(name+" is ruuning... ");
    }
    public static void main(String[] args) { // creating different objects for the animal4 class
        Animal4 tom = new Animal4();
        Animal4 jerry = new Animal4();

        tom.eat("Tom", "fish"); // passing an argument
        tom.run("Tom");
        jerry.eat("Jerry", "Carret");
        jerry.run("Jerry");
    }
}
