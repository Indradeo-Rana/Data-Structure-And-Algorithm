// package Arrays;

// import java.util.Map.Entry;
// import java.util.HashMap;

// public class NonReapetingEle {

//     public static void main(String[] args) {
//         int [] arr={1,2,3,6,5,2,3,1};
//         // for(int i =0;i<arr.length;i++){
//         //     int count=0;
//         //     int num=arr[i];
//         //     for(int j =0;j<arr.length;j++){
//         //         if(arr[j]==num){
//         //             count++;
//         //         }
//         //     }
//         //     if(count==1){
//         //         System.err.println(arr[i]);
//         //         break;
//         //     }
//         // }

//         // HashMap<Integer,Integer> map  = new HashMap<>();
//         // for(int i:arr){
//         //     if(!map.containsKey(i)){
//         //         map.put(i, 1);
//         //     }
//         //     else{
//         //         int count = map.get(i);
//         //         map.put(i, count+1);
//         //     }
//         // }
//         // for(Entry<Integer,Integer> id:map.entrySet() ){
//         //     if(id.getValue()==1){
//         //         System.out.println(id.getKey());
//         //         break;
//         //     }
//         // }

//         // xor 
//         int xorResult = 0;

//         // XOR all elements of the array
//         for (int num : arr) {
//             xorResult ^= num; // Accumulate the XOR result
//         }

//         System.out.println(xorResult); // The result is the non-repeating element

//     }
// }

package Arrays;

public class NonReapetingEle {
    static int pass(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (num == arr[j]) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1,8,3,2,4,1 };
        System.out.println("\nNon reaptng number is: ");
        System.out.println(pass(arr));

        int xorResult = 0;
        for (int num : arr) {
            xorResult ^= num; // Accumulate the XOR result
        }

        System.out.println(xorResult); // The result is the non-repeating element

    }
}
