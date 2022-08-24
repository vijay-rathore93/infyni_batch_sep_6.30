package org.vijaycode.abstractClasses;

public class Employee extends Company{

    private String empName;
    private String empCode;

    public Employee(String empName, String empCode,String companyName,String companyCode) {
        // super();
         super("companyName","companyCode");
        this.empName = empName;
        this.empCode = empCode;
        setName(companyName);
        setCode(companyCode);
        //super.setName(companyName);
        //super.setCode(companyCode);
    }

    @Override// coming from abstract class
    public void showCompanyInfo() {
        System.out.println("Company Name:"+getName());
        System.out.println("Company Code:"+getCode());
    }

    @Override// coming from interface
    public void show() {
        System.out.println("Employee Name:"+this.empName);
        System.out.println("Employee Code:"+this.empCode);
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }


}
