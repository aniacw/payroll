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
                System.out.println(employees);
            }

            if ("edit".equals(command)) {
                System.out.println("Please select the ID...");
                Scanner editScanner = new Scanner(System.in);
                Integer idToEdit = editScanner.nextInt();
                System.out.println("Please type new name...");
                String newName = editScanner.next();
                System.out.println("Please type new surname...");
                String newSurname = editScanner.next();
                System.out.println("Please type new gross salary...");
                Double newGrossSalary = editScanner.nextDouble();
                employees.get(idToEdit).getName().replaceAll("", newName);
                employees.get(idToEdit).getSurname().replaceAll("", newSurname);
                employees.get(idToEdit).setGrossSalary(newGrossSalary);
                System.out.println(employees);
            }

            if ("remove".equals(command)) {
                System.out.println("Please type ID to be removed...");
                Scanner removeScanner = new Scanner(System.in);
                Integer idToRemove = removeScanner.nextInt();
                employees.remove(idToRemove);
                System.out.println(employees);
            }

            if ("return".equals(command)) {
                System.out.println("Menu" + "\n" + "Please select option");
            }
        } while (!"END".equalsIgnoreCase(command));
    }
}