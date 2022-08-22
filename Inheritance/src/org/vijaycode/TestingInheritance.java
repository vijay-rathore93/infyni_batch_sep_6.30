package org.vijaycode;

import org.vijaycode.inheritance.single.Employee;

public class TestingInheritance {

    //psvm+Enter
    public static void main(String[] args) {

       // Organization organization=new Employee("Vijay Rathor", 54321,"Deutche Telekom","Gurgaon",12345);

        Employee employee=new Employee("Vijay Rathor", 54321,"Deutche Telekom","Gurgaon",12345);


        //organization public setter for data members
       /* employee.setName("Deutche Telekom");
        employee.setAddress("Gurgaon");
        employee.setCode(12345);

        //Employee public setter for data members
        employee.setEmpName("vijay Rathod");
        employee.setEmpId(54321);*/

        employee.showInformation();
    }
}
