package comparatorAndComparable;

import java.util.Comparator;

public class EmployeeComparatorEmail implements Comparator<Employee> {


    @Override
    public int compare(Employee employee, Employee employee1) {
        return employee.getEmail().compareTo(employee1.getEmail());
    }
}
