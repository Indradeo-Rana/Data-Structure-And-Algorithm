package Numbers;

public class Demo {
    static boolean isPrime(int n){
        if(n<=1){
            return true;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
   static void primeNumbers(int term){
        int st=2;
        int cnt=0;
        while (cnt<term) { 
            if(isPrime(st)) {
                System.out.print(st+" ");
                cnt++;
            }
            st++;
            
        }
    }
    public static void main(String[] args) {
        int term=5;
        primeNumbers(term);
    }
}