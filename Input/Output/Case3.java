import java.util.ArrayList;
import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : "); //1 2 3 4--> "1, 2, 3, 4, 5"
        String str = sc.nextLine();
        String [] nums=str.split(",");  // "1" "2" "3" "4"
        ArrayList<Integer> list= new ArrayList<>();
        for(String num:nums){
            list.add(Integer.parseInt(num));//  "1"-->1
        }
        System.out.println("After converting ");
        for(int ele:list){
            System.out.print(ele+" ");
        }
    }
}
