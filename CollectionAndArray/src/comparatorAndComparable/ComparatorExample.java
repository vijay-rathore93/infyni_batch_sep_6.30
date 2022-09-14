package comparatorAndComparable;

import java.util.*;

public class ComparatorExample {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("vijay", 1, "rathorvijay529@gmail.com"),
                new Employee("vijay1", 100, "rathorvijay528@gmail.com"),
                new Employee("vijay2", 12, "rathorvijay5297@gmail.com"),
                new Employee("vijay3", 14, "rathorvijay5296@gmail.com"),
                new Employee("vijay0", 0, "rathorvijay5295@gmail.com")
        );

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 55, 1, 2, 4, 5, 6, 7, 8, 100);

        Collections.sort(list);

        Collections.sort(employees);


        Comparator<Employee> comComparator=new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }
        };

        for (Employee employee:employees) {
            System.out.println(employee);
        }




    }
}
