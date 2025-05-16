import java.util.Scanner;

class Calculator {

    void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Addition of " + num1 + " & " + num2 + " = " + sum);
    }

    void subs(int num1, int num2) {
        int ans = num1 - num2;
        System.out.println("Substraction of " + num1 + " & " + num2 + " = " + ans);
    }

    void mult(int num1, int num2) {
        int ans = num1 * num2;
        System.out.println("Multiplication of " + num1 + " & " + num2 + " = " + ans);
    }

    void div(int num1, int num2) {
        float ans = num1 / num2;
        System.out.println("Division of " + num1 + " & " + num2 + " = " + ans);
    }
}

public class ProjectCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {

            System.out.println("Enter the value of num1  and num2 :");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Select your operation:");
            System.out.println("1. Addition \n2. Substraction \n3. Multiplication \n4. Division \n5. Exit");
            int ch = sc.nextInt();
            Calculator cal = new Calculator();

            switch (ch) {
                case 1:
                    cal.add(num1, num2);
                    break;
                case 2:
                    cal.subs(num1, num2);
                    break;
                case 3:
                    cal.mult(num1, num2);
                    break;
                case 4:
                    cal.div(num1, num2);
                    break;
                case 5:
                    flag = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (ch != 5) {
                System.out.println("Do you want to continue? (yes/no):");
                String userChoice = sc.next();
                if (userChoice.equalsIgnoreCase("no")) {
                    flag = false;
                    System.out.println("Exiting the program. Goodbye!");
                }
            }
        }

        sc.close();
    }
}
