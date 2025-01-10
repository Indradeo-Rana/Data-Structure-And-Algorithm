package Arrays;

public class Frequency {

    static void makeFreq(int[] a){
        int n = a.length;
        int[] feq= new int[10];
        for(int i :a){
            feq[i]++;
        }
        System.out.println();
        for(int i=1;i<n;i++){
            System.out.println(i+"="+feq[i]);
        }
    }
    public static void main(String[] args) {
        int [] arr ={1,2,2,3,1,4,2};
        makeFreq(arr);
    }
}
