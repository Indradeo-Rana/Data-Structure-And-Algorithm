package Inheritance;

class GrandFather{
    public void GrandMaa(){
        System.out.println("My father's  mom");
    }
}
class Father extends  GrandFather{
    public void Mom(){
        System.out.println("She is my mother");
    }
}
public class Type1 {
    
    public static void main(String[] args) {
       GrandFather papa=new GrandFather();
       System.out.println("Grandfather's properties  not father's");
       papa.GrandMaa();
       Father son=new Father();
       System.out.println("Grandfather's properties  as well as father's");

        son.GrandMaa();
       son.Mom();
    }
}
