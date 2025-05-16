package Encapsulation;

class Emp {
    protected String name;
    protected int salary;

    // Constructor to initialize fields
    public Emp(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSal(int salary) {
        this.salary = salary;
    }

    public int getSal() {
        return salary;
    }
}

public class enca {
    public static void main(String[] args) {
        // Using constructor to initialize fields
        Emp e = new Emp("Ram", 5000);
        System.out.println("Name => " + e.getName());
        System.out.println("Salary => " + e.getSal());
    }
}