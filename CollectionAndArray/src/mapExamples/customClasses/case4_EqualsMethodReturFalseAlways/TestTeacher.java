package mapExamples.customClasses.case4_EqualsMethodReturFalseAlways;


import java.util.HashMap;
import java.util.Map;

public class TestTeacher {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Vijay", 12);
        Teacher teacher2 = new Teacher("KK", 13);//44
        Teacher teacher3 = new Teacher("Vinni", 65);
        Teacher teacher4 = new Teacher("KK", 13);//44

        HashMap<Teacher, String> map = new HashMap<>();

        System.out.println(teacher2.hashCode());
        System.out.println(teacher4.hashCode());
      //  map.put(teacher, "A");//12
        map.put(teacher2, "B");//44
        map.put(teacher2, "D");//44
        map.put(teacher4, "E");//44
       // map.put(teacher3, "C");//13

        System.out.println("Size of map::" + map.size());
        System.out.println("content::" + map);
    }
}
