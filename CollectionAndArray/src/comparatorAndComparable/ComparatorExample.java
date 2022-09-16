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

        //Collections.sort(list);

       Collections.sort(employees);

        for (Employee employee:employees) {
            System.out.println(employee);
        }


        /*Comparator<Employee> comComparator=new Comparator<Employee>(){
            @Override
            public int compare(Employee employee, Employee employee1) {
               return employee.getEmpName().compareTo(employee1.getEmpName());
            }
        };*/


       // Comparator<Employee> comComparator=( employee,  employee1) -> employee.getEmpName().compareTo(employee1.getEmpName());


/*
        Collections.sort(employees, Comparator.comparing(Employee::getEmpName));

        employees.forEach(System.out::println);*/


        //employees.stream().sorted(Comparator.comparing(Employee::getEmpName)).forEach(System.out::println);


    /*   for (Employee employee:employees) {
           System.out.println(employee);
        }*/








     /*   Comparator<Employee> comComparatorEmail=new Comparator<Employee>(){
            @Override
            public int compare(Employee employee, Employee employee1) {
                return employee.getEmail().compareTo(employee1.getEmail());
            }
        };*/

//        Collections.sort(employees,comComparatorEmail);
//
//        for (Employee employee:employees) {
//            System.out.println(employee);
//        }


//        EmployeeComparatorEmail employeeComparatorEmail=new EmployeeComparatorEmail();
//
//        Collections.sort(employees,employeeComparatorEmail);
//
//        for (Employee employee:employees) {
//            System.out.println(employee);
//        }

    }
}
