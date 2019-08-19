package project.POJO;

public class Company {
    private Employee employee;
    private Address address;

    public Company() {
    }

    public Company(Employee employee, Address address) {
        this.employee = employee;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "employee=" + employee +
                ", address=" + address +
                '}';
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
