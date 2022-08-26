package org.vijaycode.keywords.staticKeywords;

public class TestStatic {

    static{
        System.out.println("===========================================");
    }

    public static void main(String[] args) {
        Employee employee=new Employee("Vijay");
        Employee employee2=new Employee("Vikash");
        Employee employee3=new Employee("Vinay");

        employee.show();
        //employee.k1();//not accommodate

        employee2.show();
       // Employee.k1();
        employee3.show();

    }
}
