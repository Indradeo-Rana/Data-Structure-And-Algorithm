
package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Basic1 {

    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr={1,2,3,4,3};
        for(int n:arr){
            if(!map.containsKey(n)){
                map.put(n, 1);
            }
            else{
                int cnt = map.get(n);
                map.put(n, cnt+1);
            }
        }
        System.out.println(map);

        for(Entry<Integer,Integer> name:map.entrySet()){
            if(name.getValue()==2){
                System.out.println(name.getKey());
            }
        }
    }
}