package models;

public class Employee {
    private int empID;
    private String empFirstName;
    private String empLastName;
    private String empEmail;
    private String empDept;


    public Employee(int empID, String empFirstName, String empLastName, String empEmail, String empDept) {
        this.empID = empID;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empEmail = empEmail;
        this.empDept = empDept;

    }

    public Employee() {

    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public String getGetEmpDept() {
        return empDept;
    }

    public void setGetEmpDept(String getEmpDept) {
        this.empDept = getEmpDept;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empID=" + empID +
                ", empFirstName='" + empFirstName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empDept='" + empDept + '\'' +
                '}';
    }

    public void add(Employee employee) {
    }
}