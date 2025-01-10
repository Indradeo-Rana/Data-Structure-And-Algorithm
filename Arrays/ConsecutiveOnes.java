package Arrays;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int [] a={1,1,0,1,1,1,1};
        int countOne=0;
        int ans=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                countOne++;
            }
            else{
                countOne=0;
            }
            ans=Math.max(countOne, ans);
        }
        System.out.println(ans);
    }
    
}
