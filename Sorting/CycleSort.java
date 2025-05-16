package Sorting;
class CycleSort{

    public static void main(String[] args){
        int[] arr= {1,4,6,3,6,5};
         sortFun(arr);
    }
    static void sortFun(int [] arr){
        int s=0;int end=arr.length;
        while (s<end) {
            int elePos=arr[s];
            int correctPos=elePos-1;
            if(arr[elePos]!=arr[correctPos]){
                int temp=arr[elePos];
                arr[elePos] =arr[correctPos];
                arr[correctPos]=temp;
            }else{
                s++;
            }
        }
        for(int i=0;i<end;i++){
            System.out.print(i+1 +" ");
        }
    }
    
}