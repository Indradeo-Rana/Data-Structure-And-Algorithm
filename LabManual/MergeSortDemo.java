public class MergeSortDemo {

    // Merge function to merge two sorted halves
        public static void mergeFunction(int[] arr, int l, int mid , int r){
            int n1=mid-l+1;
            int n2=r-mid;
            int[] le=new int[n1];
            int[] re=new int[n2];
            for(int i=0;i<n1;i++){
                le[i]=arr[l+i];
            }
            for(int j=0;j<n2;j++){
                re[j]=arr[mid+1+j];
            }
            int i=0;int j=0;int k=l;
            while (i<n1 && j<n2) {
                if(le[i]<=re[j]){
                    arr[k++]=le[i++];
                }else{
                    arr[k++]=re[j++];
                }
            }
            while(i<n1){
                arr[k++]=le[i++];
            }
            while(j<n2){
                arr[k++]=re[j++];
            }
        }
    // Merge Sort function
    public static void mergeSort(int[] arr, int l, int r){
        if(l>=r) return;
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        mergeFunction(arr, l,mid ,r);
    }

    // Function to display the array
    public static void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        int n = arr.length;

        System.out.println("Original Array:");
        display(arr);

        mergeSort(arr, 0, n-1);

        System.out.println("Sorted Array:");
        display(arr);
    }
}
