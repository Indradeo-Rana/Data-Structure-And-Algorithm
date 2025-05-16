import java.util.ArrayList;
import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entter the number :");
        int n=sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
        // int[] arr=new int[n];
        for (int i = 0; i < n ;i++) {
            System.out.println("Enter the "+i+"th index: ");
            list.add(sc.nextInt());
        }
        System.out.println("ArrayList will be: ");
        for(int i=0;i<n;i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
