import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(Employee.EmployeeBuilder.employeeBuilder()
                .withSurname("Jones")
                .withName("Jack")
                .withGrossSalary(5400.00)
                .build());
        employees.add(Employee.EmployeeBuilder.employeeBuilder()
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
        employees.add(Employee.EmployeeBuilder.employeeBuilder()
                .withName("Mark")
                .withGrossSalary(8000.00)
                .withSurname("Williams")
                .build());
        employees.add(Employee.EmployeeBuilder.employeeBuilder()
                .withSurname("Potato")
                .withGrossSalary(7000.00)
                .withName("Jane")
                .build());
        employees.add(Employee.EmployeeBuilder.employeeBuilder()
                .withName("Thomas")
                .withGrossSalary(5000.00)
                .withSurname("Heywood")
                .build());

        String command = "";
        do {
            Menu menu = new Menu();
            command = menu.printMainMenu();

            if ("listE".equals(command)) {
                System.out.println(employees);
            }

            if ("add".equals(command)) {
                menu.addEmployeeMenu();
                System.out.println(menu.employeesToAdd);
                System.out.println(employees);
            }

            if ("edit".equals(command)) {
                menu.editEmployeeMenu();
                employees.get(menu.getIdToEdit()).getName().replaceAll("", menu.getNewName());
                employees.get(menu.getIdToEdit()).getSurname().replaceAll("", menu.getNewSurname());
                employees.get(menu.getIdToEdit()).setGrossSalary(menu.getNewGrossSalary());
                System.out.println(employees);
            }

            if ("remove".equals(command)) {
                menu.removeEmployeeMenu();
                employees.remove(menu.getIdToRemove());
                System.out.println(employees);
            }

            if ("return".equals(command)) {
                System.out.println("Menu" + "\n" + "Please select option");
            }
        } while (!"END".equalsIgnoreCase(command));
    }
}