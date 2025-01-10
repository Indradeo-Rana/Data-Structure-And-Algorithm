package Arrays;

import java.util.HashSet;

public class Intersections {
    public static void main(String[] args) {
        int[] a1 ={1,2,3,6,5,4};
        int[] a2 ={1,5,3,4};
        HashSet<Integer> set= new HashSet<>();
        for(int num :a1){
            set.add(num);
        }
        HashSet<Integer> intersection = new HashSet<>();
        for( int i:a2){
            if(set.contains(i)){
                intersection.add(i);
            }
        }
        System.out.println("Intersection : "+intersection);
    }
}
