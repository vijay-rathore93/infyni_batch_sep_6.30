package mapExamples.customClasses.case3_OverideEqualsMethodAndHashCodeMethod;

import mapExamples.customClasses.case2_OverideEqualsMethodOnly.Catalog;

import java.util.HashMap;
import java.util.Map;

public class TestStudent {

    public static void main(String[] args) {
        Student student = new Student("Vijay", 12);
        Student student2 = new Student("KK", 13);
        Student student3 = new Student("Vinni", 65);

        Map<Student, String> map = new HashMap<>();
        map.put(student, "A");
        map.put(student2, "B");//what will be size
        map.put(student2, "D");//what will be size
        map.put(student3, "C");//what will be size

        System.out.println("Size of map::" + map.size());

        System.out.println("content::" + map);


    }
}
