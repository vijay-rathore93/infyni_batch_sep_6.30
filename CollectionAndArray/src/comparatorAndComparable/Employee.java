package comparatorAndComparable;

public class Employee implements Comparable<Employee>{

    private String empName;
    private int empId;
    private String email;

    public Employee(String empName, int empId, String email) {
        this.empName = empName;
        this.empId = empId;
        this.email = email;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Employee employee) {
        if(employee.getEmpId()< this.empId)
            return 1;
        else if(employee.getEmpId()> this.empId)
            return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", email='" + email + '\'' +
                '}';
    }
}
