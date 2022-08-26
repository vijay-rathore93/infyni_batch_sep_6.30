package org.vijaycode.keywords.staticKeywords;

public class Employee {


    static{
        System.out.println("===================Employee========================");
    }


    private String name;

    private static String companyName="TCS";


    public Employee(String name) {
        System.out.println("++++++++++");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }
    public static void  k1(){
        companyName="feeferf";
    }


    public void show(){
        System.out.println("Name:"+this.name);
        System.out.println("CompanyName:"+companyName);
        //companyName="efeferf";
        //setCompanyName("rdhtdhtdtr");
    }


}
