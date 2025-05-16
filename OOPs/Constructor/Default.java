// Constructor is used to initialize the objects not to create the objects
// it is a special method same name as class name, 
// it does not have any return type
//it does not support any non access modifier only support
class Test{

    public Test(){

        System.out.println("This is a default constructor..");
    }
   

}

public class Default {
    
    public static void main(String[] args) {
        // Test t1 = new Test();
        new Test();
    }
}
