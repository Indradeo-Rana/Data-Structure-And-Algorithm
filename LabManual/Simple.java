
import java.util.*;
public class Simple {
    public static void main(String [] arvvs){
        System.out.println("Enter the sixze of the items; ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] profit=new int[n];
        int[] weight=new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the profit of item "+(i+1) +" :");
            profit[i]=sc.nextInt();
            System.out.println("Enter the wiegth of item "+(i+1) +" :");
            weight[i]=sc.nextInt();
        }
        System.out.println("enter the capacirt ih bag :");
        int w= sc.nextInt();

        int maxProfit= knapsack(w,n, weight,profit);
        System.out.println(maxProfit);
    }
    
    static int knapsack(int w, int n,int[] wiegth, int[] profit){
        int[][] dp=new int[n+1][w+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if(i==0 || j==0)
                    dp[i][j]=0;
                else if(wiegth[i-1]<=j){
                    dp[i][j]=Math.max(profit[i - 1] + dp[i - 1][j - wiegth[i - 1]],dp[i-1][j]);
                }else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][w];
    }
}