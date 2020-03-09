package group.check.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee extends ProductionControl{

    @Id
    @Column(name = "tab_number")
    private int tabNumber;

    @Column(name = "fio")
    private String fio;

    @Column(name = "department")
    private String department;

    @Column(name = "employee_role")
    private boolean employeeRole;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "inspector")
    private Set<Checks> checks_inspector;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "executor")
    private Set<Checks> checks_executor;

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

    public boolean getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(boolean employeeRole) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getTabNumber() != employee.getTabNumber()) return false;
        if (getEmployeeRole() != employee.getEmployeeRole()) return false;
        if (getFio() != null ? !getFio().equals(employee.getFio()) : employee.getFio() != null) return false;
        return getDepartment() != null ? getDepartment().equals(employee.getDepartment()) : employee.getDepartment() == null;

    }

    @Override
    public int hashCode() {
        int result = getTabNumber();
        result = 31 * result + (getFio() != null ? getFio().hashCode() : 0);
        result = 31 * result + (getDepartment() != null ? getDepartment().hashCode() : 0);
        result = 31 * result + (getEmployeeRole() ? 1 : 0);
        return result;
    }
}
