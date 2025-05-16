package Numbers;

public class Harshad {
    // Harshad (Or Niven) Number => 18 => 1+8=9 and 18%9==0
    public static void main(String[] args) {
        int num = 15;
        int num1=num;
        int digitSum = 0;
        if (num < 10) {
            System.out.println(num1 + " is Harshad");
        } else {
            while (num != 0) {
                int rem = num % 10;
                digitSum += rem;
                num = num / 10;
            }
            if (num1 % digitSum == 0) {
                System.out.println(num1 + " is Harshad");
            }else{
                System.out.println(num1 +" is not Harshad");
            }
        }
    }
}
