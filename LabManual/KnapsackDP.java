// import java.util.Scanner;

// public class KnapsackDP {
//     // Function to solve 0/1 Knapsack problem using Dynamic Programming
//     public static int knapsack(int W, int weights[], int profits[], int n) {
//         int dp[][] = new int[n + 1][W + 1];

//         // Build the DP table
//         for (int i = 0; i <= n; i++) {
//             for (int w = 0; w <= W; w++) {
//                 if (i == 0 || w == 0)
//                     dp[i][w] = 0; // Base case: No items or 0 weight capacity
//                 else if (weights[i - 1] <= w)
//                     dp[i][w] = Math.max(profits[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
//                 else
//                     dp[i][w] = dp[i - 1][w];
//             }
//         }
//         return dp[n][W]; // The maximum profit possible
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // Input
//         System.out.print("Enter the number of items: ");
//         int n = sc.nextInt();

//         int weights[] = new int[n];
//         int profits[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter profit for item " + (i + 1) + ": ");
//             profits[i] = sc.nextInt();
//             System.out.print("Enter weight for item " + (i + 1) + ": ");
//             weights[i] = sc.nextInt();
//         }

//         System.out.print("Enter the capacity of the knapsack: ");
//         int W = sc.nextInt();

//         // Solve and display result
//         int maxProfit = knapsack(W, weights, profits, n);
//         System.out.println("Maximum Profit: " + maxProfit);

//         sc.close();
//     }
// }

public class KnapsackDP {
    public static int knapsack(int[] wt, int[] val, int W) {
        int n = wt.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if (wt[i - 1] <= w) {
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] weights = {1, 3, 4};
        int[] values = {150, 200, 300};
        int capacity = 4;

        System.out.println("Maximum value: " + knapsack(weights, values, capacity));
    }
}
