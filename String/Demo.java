package String;

import java.util.HashMap;

public class Demo {

    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 6, 4 };
        int k = 6;

        int xr = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(xr, 1);
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            xr = xr ^ arr[i];
            int x = xr ^ k;
            if (map.containsKey(x)) {
                cnt += map.get(x);
            }
            if (map.containsKey(xr)) {
                map.put(xr, map.get(xr) + 1);
            } else {
                map.put(xr, 1);
            }
        }
        System.out.println(cnt);
    }
}
