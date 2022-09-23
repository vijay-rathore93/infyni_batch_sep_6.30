package mapExamples.customClasses.case4_EqualsMethodHashCodeReturnConstant;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor("Vijay", 12);
        Professor professor2 = new Professor("KK", 13);//44
        Professor professor3 = new Professor("Vinni", 65);
        Professor professor4 = new Professor("KK", 13);//44

        Map<Professor, String> map = new LinkedHashMap<>();

        System.out.println(professor2.hashCode());
        System.out.println(professor4.hashCode());
        map.put(professor, "A");//12
        map.put(professor2, "B");//44
        map.put(professor2, "D");//44
        map.put(professor4, "E");//44
        map.put(professor3, "C");//13

       System.out.println("Size of map::" + map.size());
       System.out.println("content::" + map);
    }
    
}

//what will happen if hashcode always return constant?
//ans: Collision will happen, and data is going to store in the linkedList till java 7.


//with context to map what are change are in present in java 7 vs java 8?
