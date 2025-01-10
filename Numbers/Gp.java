package Numbers;
//  A Geometric series is a series with a constant ratio between successive terms. The first term of the series is denoted by a and common ratio is denoted by r. The series looks like this :- a, ar, ar2, ar3, ar4, . . .. The task is to find the sum of such a series.
public class Gp {
    public static double calculateSum(double a, double r, int n) {
        // Use the formula for sum of a geometric progression: S_n = a * (1 - r^n) / (1 - r)
        if (r == 1) {
            // If the common ratio is 1, the sum is simply n times the first term
            return a * n;
        } else {
            return a * (1 - Math.pow(r, n)) / (1 - r);
        }
    }
   public static void main(String[] args) {
        // Initialize variables
        double a = 1;  // First term
        double r = 0.5;  // Common ratio
        int n = 10;  // Number of terms

        // Calculate the sum of the first n terms
        double sum = calculateSum(a, r, n);

        // Print the result
        System.out.println("The sum of the first " + n + " terms of the geometric progression is: " + sum);
    }
}


// Input : a = 1
//         r = 0.5
//         n = 10
// Output : 1.99805