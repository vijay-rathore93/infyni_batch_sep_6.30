package org.vijaycode.abstractClasses;

public class TestAbstractClass {

    public static void main(String[] args) {
        //Company company=new Company();  not possible as abstract classes can not have object.

        Employee employee = new Employee("Vijay", "DEUTH12345", "DEUTHCHE", "D12345");

        employee.showCompanyInfo();
        employee.show();
    }
}
