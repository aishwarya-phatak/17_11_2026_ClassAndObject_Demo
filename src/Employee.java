//class Employee
public class Employee {

    //data members of a class
    private int empId;
    private String empName;
    private String empCity;
    private double empSalary;

    //default constructor
    Employee() {
        IO.println("Employee Default Constructor");
        this.empId = 100;
        this.empName = "Omkar";
        this.empCity = "Pune";
        this.empSalary = 344234.23;
    }

    //parameterized constructor
    Employee(int eId, String eName, String eCity, double eSalary){
        IO.println("Employee parameterized constructor");
        this.empId = eId;
        this.empName = eName;
        this.empCity = eCity;
        this.empSalary = eSalary;
    }

    //member function
    void display(){
        System.out.println("\nDisplay method of Employee class");
        IO.println("\nEmployee class empId : " + empId + "empName : " + empName);
    }

    //Object class methods in java
    @Override
    public String toString() {
        return "\nemp name is  : " + empName + "\nemp id is : " + empId + "\n emp salary is : " + empSalary;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.empId == (((Employee) obj).empId);
    }
}
