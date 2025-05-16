import java.util.*;
public class Case1 {
    public static void main(String args[] ){
        Scanner sc= new Scanner(System.in);
        int f1=0;int f2=1;
        int sum=0;
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            // System.out.print(f1+" ,");
            int f3=f1+f2;
            f1=f2;
            f2=f3;
            sum+=f1;
        }
        System.out.println("total sum : " +sum);
        sc.close();
    }
}
