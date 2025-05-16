import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        // Generate an array of random numbers
        Random random = new Random();
        int[] array = generateRandomArray(size, 1, 100, random);
        System.out.println("Generated Array: " + Arrays.toString(array));
        System.out.println("Choose search type:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        int choice = sc.nextInt();
        long startTime = System.nanoTime(); // Record start time
        switch (choice) {
            case 1:
                System.out.print("Enter the number to search: ");
                int linearSearchKey = sc.nextInt();
                int linearSearchResult = linearSearch(array, linearSearchKey);
                if (linearSearchResult != -1)
                    System.out.println(linearSearchKey + " found at index " + linearSearchResult);
                else
                    System.out.println(linearSearchKey + " not found in the array.");
                break;
            case 2: // Binary search requires a sorted array
                 Arrays.sort(array);
                System.out.print("Enter the number to search: ");
                int binarySearchKey = sc.nextInt();
                int binarySearchResult = binarySearch(array, binarySearchKey);
                if (binarySearchResult != -1)
                    System.out.println(binarySearchKey + " found at index " + binarySearchResult);
                else
                    System.out.println(binarySearchKey + " not found in the array.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        long endTime = System.nanoTime(); // Record end time 
        long duration = endTime - startTime;
             System.out.println("Time taken: " + duration + " nanoseconds");
        sc.close();
    }

    // Linear Search Time Complexity: O(n)
    private static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1; // Key not found
    }

    // Binary Search Time Complexity: O(log n)
    private static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {

            int mid = (low + high) / 2;
            if (array[mid] == key)
                return mid; // Key found
            else if (array[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1; // Key not found
    }

    private static int[] generateRandomArray(int size, int min, int max, Random random) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

}

/* 
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("ente the size of the arrayt");
     int n= sc.nextInt();
     Random a= new Random();
     int[] arr= new  int[n];
     for (int i = 0; i < arr.length; i++) {
        arr[i]=a.nextInt(100);
     }
     System.out.println("original array:"+Arrays.toString(arr));

     System.out.println("Enter the search type :");
     System.out.println("1. linear serch");
     System.out.println("2. binary serch");
     long startTime=System.nanoTime();
     int choise= sc.nextInt();
     switch (choise) {
        case 1:
            System.out.println("Enter the ele to serach");
            int ele=sc.nextInt();
            int linear=lineraSearch(arr, ele);
            if(linear!=-1){
                System.out.println( "found at index: "+linear);
            }else{
                System.out.println("nit found");
            }
            break;
        case 2:
            System.out.println("engttr eyhe element to be search");
            int key=sc.nextInt();
            Arrays.sort(arr);
            int binary=binarysearch(arr, key);
            if(binary!=-1){
                System.out.println(key + "found at index: "+binary);
            }else{
                System.out.println("nit found");
            }
        default:
        System.out.println("dfijhijo");
     }
     long endTime=System.nanoTime();
     long totalTime= endTime-startTime;
     System.out.println("totol time taken :"+totalTime);
}
static int lineraSearch(int[] arr, int ele){
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==ele)
        return i;
    }
    return -1;
}
static int binarysearch(int[] arr, int key){

    return -1;
}
*/