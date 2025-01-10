package Arrays;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
// first approach
public class LeadersElement {
    public static ArrayList<Integer> printLeadersBruteForce(int[] a, int n) {

        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            boolean leader=true;
            for(int j=i+1;j<n;j++){
                if(a[j]>a[i]){
                    leader=false;
                    break;
                }
            }
            if(leader){
                ans.add(a[i]);
            }
        }

        // convert arraylist to hashset
        HashSet<Integer> set = new HashSet<>(ans);
        ArrayList<Integer> ans1= new ArrayList<>(set);
        Collections.sort(ans1);
        return ans1;
    }


    // 2nd approach
    static ArrayList<Integer> printLeadersSinglePass(int[] arr,int n){
        ArrayList<Integer> ans= new ArrayList<>();
        int maxFromRight=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=maxFromRight){
                ans.add(arr[i]);
                maxFromRight=arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String args[]) {
        int n = 3;
        int arr[] = {5, 4 ,3};
        //ArrayList<Integer> ans = printLeadersBruteForce(arr, n);
        ArrayList<Integer> ans = printLeadersSinglePass(arr, n);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
