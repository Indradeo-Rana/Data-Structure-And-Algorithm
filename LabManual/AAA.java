import java.util.*;

class AAA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        
        int a[] = new int[n];
        Random rn = new Random();
        for(int i=0;i<n;i++){
            a[i]=rn.nextInt(100);
        }
        System.out.println("Entered array is: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        merge(a,0,n-1);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
    public static void merge(int []a, int l, int r ){
        while(l>=r){
            int mid=l+(r-l)/2;
            merge(a,l,mid);
            merge(a,mid+1,r);
            mergeSort(a,l,mid,r);
        }
    }
    public static void mergeSort(int []a, int l, int mid, int r){
        int n1= mid-l+1;
        int n2= r-mid;
        
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        System.arraycopy(a,l,left,0,n1);
        System.arraycopy(a,mid+1,right,0,n2);
        
        int i=0;int j=0;int k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                a[k++]=left[i++];
            }
            else{
                a[k++]=right[j++];
            }
        }
        while(i<n1){
            a[k++]=left[i++];
        }
        while(j<n2){
            a[k++]=right[j++];
        }
    }
    
}