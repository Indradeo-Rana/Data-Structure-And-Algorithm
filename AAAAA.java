class AAAAA{

    public static void main(String[] args){

        int[] arr= {6,2,3,4,7,2,1,7,2};
        int k=2;
        System.out.println(largest(arr,k));
    }
    static int largest(int[] arr, int k){
        int leftS=0;int rightS=0; int maxS=0;
        for(int i=0;i<k;i++){
            leftS+=arr[i];
        }
        // System.out.println(leftS);
        int last=arr.length-1;
        for(int i=k-1;i>=0;i--){
            leftS-=arr[i];
            rightS+=arr[last];
            last--;
            maxS=Math.max(maxS,leftS+rightS);
        }
        return maxS;
    }

}