package Numbers;
//   A series with the same common difference is known as arithmetic series
public class Ap {
    

    public static void main(String[] args) {
        int a=1;     // here a is the first term
        int d=3;      // here d is the same common difference
        int n =5;    // n is the last term'
        int sum =0+a;
        for(int i=0;i<n;i++){
            System.out.print(sum+" ");
             sum =sum+d;
        }

       // System.out.println("Sum of AP is :");
       double ans=(n/2.0);
       System.out.println();

        System.out.println((ans * (2 * a + (n - 1) * d))); // this will print sum of AP
        System.out.println();
        
    }
}
//((n / 2) * (2 * a + (n - 1) * d)) => this is the required formula