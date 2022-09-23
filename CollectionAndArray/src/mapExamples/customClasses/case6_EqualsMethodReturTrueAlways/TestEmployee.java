package mapExamples.customClasses.case6_EqualsMethodReturTrueAlways;

import java.util.HashMap;
import java.util.Map;

public class TestEmployee {

    public static void main(String[] args) {
        Employee employee = new Employee("Vijay", 12);
        Employee employee2 = new Employee("KK", 13);//44
        Employee employee3 = new Employee("Vinni", 65);
        Employee employee4 = new Employee("KK", 13);//44

        Map<Employee, String> map = new HashMap<>();

        System.out.println(employee2.hashCode());
        System.out.println(employee4.hashCode());
        map.put(employee, "A");//12
        map.put(employee2, "B");//44
        map.put(employee2, "D");//44
        map.put(employee4, "E");//44
        map.put(employee3, "C");//13

        System.out.println("Size of map::" + map.size());
        System.out.println("content::" + map);
    }
}
//As hashcode for line no 19,20,21 all are same as hashcode method is overridden then equals methods says always true that means it is going to
//override all object one by one.
// Rest Object for which hashcode is different will as per logic.