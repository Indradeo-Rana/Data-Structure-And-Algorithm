package Numbers;

import java.util.Scanner;

// public class PrimeNo {
//     static boolean isPrime(int num){
//         if(num==2){
//             return true;
//         }
//         else{
//             for(int i =2;i<num/2;i++){
//                 if(num%i==0){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num =sc.nextInt();
//         sc.close();
//         System.out.println(isPrime(num));
//     }
// }

// *******************************  first nth term prime number ***********************

public class PrimeNo {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){  // math.sqrt is used to reduce the time complexity
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int term=5;
        int cnt=0;
        int st=2;
        while (cnt<term) {
            if(isPrime(st)){
                System.out.print(st+" ");
                cnt++;
            }
            st++;
        }
    }
}