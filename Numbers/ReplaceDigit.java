package Numbers;

public class ReplaceDigit {
    public static void main(String[] args) {
        int num = 1020;
        int ans = 0;

        while (num != 0) {
            int rem = num % 10; // Extract the last digit
            if (rem == 0) {
                rem = 5; // Replace 0 with 5
            }
            ans = ans * 10 + rem; // Append the digit
            num = num / 10; // Remove the last digit
        }

        // Reverse the result to correct the order
        int finalAns = 0;
        while (ans != 0) {
            finalAns = finalAns * 10 + (ans % 10);
            ans = ans / 10;
        }

        System.out.println(finalAns);
    }

}
