package mapExamples.customClasses.case5_EqualsMethodTrueHashCodeReturnConstant;


import java.util.HashMap;
import java.util.Map;

public class TestPrinciple {
    public static void main(String[] args) {
        Principle principle = new Principle("Vijay", 12);
        Principle principle2 = new Principle("KK", 13);//44
        Principle principle3 = new Principle("Vinni", 65);
        Principle principle4 = new Principle("KK", 13);//44

        Map<Principle, String> map = new HashMap<>();

        System.out.println(principle2.hashCode());
        System.out.println(principle4.hashCode());
        map.put(principle, "A");//12
        map.put(principle2, "B");//44
        map.put(principle2, "D");//44
        map.put(principle4, "E");//44
        map.put(principle3, "C");//13

        System.out.println("Size of map::" + map.size());
        System.out.println("content::" + map);
    }
}

//Collision will happen and all elements will store in same location  and equal method will say , all

// elements are same then all will override.
