package mapExamples.customClasses.miscellenium;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("ABC",12);//4
        map.put("ABC",13);
        map.put("ABCD",14);
        map.put("ABCE",12);
        System.out.println("Size of map::"+map.size());

        //equals
        //hashcode

    }
}
