package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Basic {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // inserting values in the map
        map.put("Red", 1);
        map.put("Green", 2);
        // accessing ele
        // System.out.println();
        // System.out.println(map);
        // using for loop
        // for(Entry<String,Integer> x:map.entrySet()){
        //     System.out.println(x.getKey()+" "+x.getValue());
        // }
        // to find size
        // System.out.println(map.size());

        // we can print this ways also
        for(String key:map.keySet()){
            System.out.println(key+": "+map.get(key));
        }
    }
    
}
