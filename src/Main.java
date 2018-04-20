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

        Menu menu = new Menu();
        menu.printMainMenu();

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        if (userInput.equals("listE")) {
            System.out.println(employees);
        }

        if (userInput.equals("edit")) {
            System.out.println("Please select the ID...");
            Integer idToEdit = scanner.nextInt();
            System.out.println("Please type new name...");
            String newName = userInput;
            System.out.println("Please type new surname...");
            String newSurname = userInput;
            System.out.println("Please type new gross salary...");
            Double newGrossSalary = scanner.nextDouble();
            employees.get(idToEdit).getName().replaceAll("", newName);
            employees.get(idToEdit).getSurname().replaceAll("", newSurname);
            employees.get(idToEdit).setGrossSalary(newGrossSalary);
            System.out.println(employees);
        }

        if (userInput.equals("remove")) {
            System.out.println("Please type ID to be removed...");
            Integer idToRemove = scanner.nextInt();
            employees.remove(idToRemove);
            System.out.println(employees);
        }

        if (userInput.equals("return")) {
            System.out.println("Menu" + "\n" + "Please select option");
        }
    }
}
