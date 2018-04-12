import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(Employee.EmployeeBuilder.employeeBuilder()
                .withSurname("Jones")
                .withName("Jack")
                .withGrossSalary(5400.00)
                .build());
        employees.add( Employee.EmployeeBuilder.employeeBuilder()
                .withGrossSalary(7100.00)
                .withName("Terry")
                .withSurname("Wilson")
                .build());
        employees.add(Employee.EmployeeBuilder.employeeBuilder()
                .withGrossSalary(4600.00)
                .withName("Robin")
                .withSurname("Hood")
                .build());
        employees.add(Employee.EmployeeBuilder.employeeBuilder()
                .withSurname("Wells")
                .withName("Hanna")
                .withGrossSalary(9500.00)
                .build());
        employees.add( Employee.EmployeeBuilder.employeeBuilder()
                .withName("Mark")
                .withGrossSalary(8000.00)
                .withSurname("Williams")
                .build());
        employees.add( Employee.EmployeeBuilder.employeeBuilder()
                .withSurname("Potato")
                .withGrossSalary(7000.00)
                .withName("Jane")
                .build());
        employees.add(Employee.EmployeeBuilder.employeeBuilder()
                .withName("Thomas")
                .withGrossSalary(5000.00)
                .withSurname("Heywood")
                .build());

        System.out.println("Menu" + "\n" + "Please select one of the following options: listE, add, edit, remove, return...");

        Menu menu = new Menu();
        menu.displayEmployees();
        menu.addEmployee();
        menu.editEmployee();
        menu.removeEmployee();
        menu.goBack();
    }
}
