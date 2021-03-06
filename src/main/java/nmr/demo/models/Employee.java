package nmr.demo.models;

public class Employee {
    private static int employeeId;
    private String empName;
    private String position;
    private String address;
    private String zipCode;
    private int phone;
    private String email;

    public Employee() {
    }

    public Employee(int employeeId, String empName, String position, String address, String zipCode, int phone, String email) {
        this.employeeId = employeeId;
        this.empName = empName;
        this.position = position;
        this.address = address;
        this.zipCode = zipCode;
        this.phone = phone;
        this.email = email;
    }

    public static int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}