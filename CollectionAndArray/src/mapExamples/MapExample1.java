package mapExamples;

import java.util.*;
/*import java.util.Map;*/

public class MapExample1 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        // HashMap<Integer,String> map1=new HashMap<>();

        map.put(1, "vijay");
        map.put(2, "vijay2");
        map.put(3, "vijay3");
        map.put(1, "vijay4");

        System.out.println(map);

        Set<Map.Entry<Integer, String>> set = map.entrySet();

//        for (Map.Entry<Integer, String> entry : set) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }


        Set<Integer> keys = map.keySet();

       /* for (Integer key : keys) {
            System.out.println(key);
        }*/


       /* Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }*/

        //I want to find value of key 3.


        Set<Map.Entry<Integer, String>> set2 = map.entrySet();

       /* for (Map.Entry<Integer, String> entry : set) {
            if (entry.getKey() == 3) {
                System.out.println(entry.getValue());
            }
        }*/

        System.out.println(map.get(3));


        //I want to find key of value vijay4.

        for (Map.Entry<Integer, String> entry : set) {
            if (entry.getValue().equalsIgnoreCase("vijay4")) {
                System.out.println(entry.getKey());
            }
        }

    }
}
