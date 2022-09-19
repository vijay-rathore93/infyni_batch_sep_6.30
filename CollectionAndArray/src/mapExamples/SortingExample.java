package mapExamples;

import java.util.*;

public class SortingExample {


    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "vijay");
        map.put(4, "vijay2");
        map.put(3, "vijay3");
        map.put(5, "vijay4");

        //sort the map on the basis of key.
        TreeMap<Integer, String> treeMap=new TreeMap<>(map);
       // System.out.println(treeMap);



        //return sorted map on the basis of value
       Set<Map.Entry<Integer, String>> set= map.entrySet();
       List<Map.Entry<Integer, String>> list=new ArrayList(set);
       Comparator<Map.Entry<Integer, String>> comparator=new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> entry1, Map.Entry<Integer, String> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        };
        Collections.sort(list,comparator);
        System.out.println(list);
        Map<Integer, String> sortedMap=new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry:list) {
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        //sortedMap
    }





}
