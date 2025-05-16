// Here i am using class variables and initilization by manually

public class Animal5 {
    // variables/ data member initilization

    // int no_of_eyes; // 0
    // String color; // null

    // int no_of_eyes=2; // not a good programming
    // String color="black";

    int no_of_eyes;
    String color;

    public void details(String name) {
        System.out.println("Detials of ");
        System.out.println(name + " has " + no_of_eyes + " eyes and its color is " + color);
    }

    public static void main(String[] args) {
        Animal5 cow = new Animal5();
        // initialization of data member for cow
        cow.no_of_eyes = 2;
        cow.color = "white";
        cow.details("Cow");

        Animal5 goat = new Animal5();
        // initialization of data member for goat

        goat.no_of_eyes = 2;
        goat.color = "brown";
        goat.details("Goat");
    }
}


// we can improve by using constructor because here we have not used another class.