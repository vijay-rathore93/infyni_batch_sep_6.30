package org.vijaycode.inheritance.single;


//<ACESS_Modifier> class <CHILD_CLASS_NAME> extends <SUPER_CLASS_NAME>
public class Employee extends Organization{

    private String empName;
    private Integer empId;

    public Employee(String empName, Integer empId,String name, String address, Integer code) {
        super(name,address,code);
        this.empName = empName;
        this.empId = empId;
    }




    /* public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }*/

    public String getEmpName() {
        return empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void showInformation(){
        System.out.println("Organization Name::"+getName());
        System.out.println("Organization Address::"+getAddress());
        System.out.println("Organization Code::"+getCode());
        System.out.println("Employee Name::"+this.empName);
        System.out.println("Employee ID::"+this.empId);
    }

}
