package Encapsulation;


class Emp{
    protected String name;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    protected int salary;

    public void SetSal(int salary){
        this.salary=salary;
    }
    public int getSal(){
        return salary;
    }
}
public class demo1{
    public static void main(String[] args) {
        Emp e =new Emp();
        e.setName("Ram");
        System.out.println("Name=> "+e.getName());
        e.SetSal(5000);
        System.out.println("salary :"+e.getSal());
    }
}