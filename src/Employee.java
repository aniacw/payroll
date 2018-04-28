import java.util.List;

public class Employee {
    private String name;
    private String surname;
    private Double grossSalary;

    public Employee() {
    }

    public Employee(String name, String surname, Double grossSalary) {
        this.name = name;
        this.surname = surname;
        this.grossSalary = grossSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public static class EmployeeBuilder {

        private String name;
        private String surname;
        private Double grossSalary;
        private List<Employee> list;

        public static EmployeeBuilder employeeBuilder() {
            return new EmployeeBuilder();
        }

        public EmployeeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public EmployeeBuilder withGrossSalary(Double grossSalary) {
            this.grossSalary = grossSalary;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee();
            employee.setName(name);
            employee.setSurname(surname);
            employee.setGrossSalary(grossSalary);
            return employee;
        }

    }
}