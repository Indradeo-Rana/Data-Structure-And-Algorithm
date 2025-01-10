package Basics;

public class SquareWithoutMultiply {
    public static void main(String[] args) {
        int n=-4;
        if(n<0)
        n= -n; // handle the negative value
        int result=0;
        for(int i=0;i<n;i++){
            result+=n;
        }
        System.out.println(result);
    }
}
