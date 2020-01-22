package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "tab_number")
    private int tabNumber;

    @Column(name = "fio")
    private String fio;

    @Column(name = "department")
    private String department;

    @Column(name = "employee_role")
    private String employeeRole;

    public int getTabNumber() {
        return tabNumber;
    }

    public void setTabNumber(int tabNumber) {
        this.tabNumber = tabNumber;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "tabNumber=" + tabNumber +
                ", fio='" + fio + '\'' +
                ", department='" + department + '\'' +
                ", employeeRole='" + employeeRole + '\'' +
                '}';
    }
}
