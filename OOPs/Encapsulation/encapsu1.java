/*  It is the process of wrapping data and methods in a single unit i.e. a class
    it is used to hide the internal implementation detilas of a class by using protected modifier.
    it is focused to enhanace security using getter and setter method
*/
package Encapsulation;

class User{
    private String name;

    // Getter and setter method for name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

public class encapsu1 {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("Indra");
       System.out.println("User's name: "+user1.getName()); 
    }
}
