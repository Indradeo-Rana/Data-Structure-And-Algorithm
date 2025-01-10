package Numbers;

public class Demo {

    static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       int start=10;
       int last =50;

       while (start<last) {
        if(isPrime(start)){
            System.out.print(start+" ");
        }

        start++;
       }
      
    }
}
