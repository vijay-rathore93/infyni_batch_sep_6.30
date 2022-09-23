package mapExamples.customClasses.case7_EqualsMethodFalseHashCodeReturnConstant;


import java.util.HashMap;
import java.util.Map;

public class TestCollege {

    public static void main(String[] args) {
        College college = new College("Vijay", 12);
        College college2 = new College("KK", 13);//44
        College college3 = new College("Vinni", 65);
        College college4 = new College("KK", 13);//44

        Map<College, String> map = new HashMap<>();

        System.out.println(college2.hashCode());
        System.out.println(college4.hashCode());
        map.put(college, "A");
        map.put(college2, "B");
        map.put(college2, "D");
        map.put(college4, "E");
        map.put(college3, "C");

        System.out.println("Size of map::" + map.size());
        System.out.println("content::" + map);
    }
}
