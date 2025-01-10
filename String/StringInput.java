package String;

import java.util.Scanner;
/* This program is based on how to take input from the user. */
public class StringInput {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        // this is the simple way
        String str= sc.nextLine();
        // using functions and instance variable
        System.out.println(str);
        sc.close();
    }
}
