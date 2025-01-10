package Recursion;

public class Basic {
    static void palindrome(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        palindrome(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n= 5;
        palindrome(n);
    }
    
}
