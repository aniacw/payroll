import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    private static final List<String> allowedCommands = Arrays.asList("listE", "add", "edit", "remove", "return");
    String command = "";

    public String printMainMenu() {
        System.out.println("Menu" + "\n" + "Please select one of the following options: listE, add, edit, remove, return...");
        do {
            Scanner scanner = new Scanner(System.in);
            command = scanner.next();
            if (!allowedCommands.contains(command)) {
                System.out.println("Invalid command. Try again");
            }
        }
        while (!allowedCommands.contains(command));
        return command;
    }

    public String printEmployeeMenu() {
        return command;
    }

    public List<Employee> addEmployeeMenu() {
        List<Employee> employeesToAdd = new ArrayList<>();
        System.out.println("Please type a name...");
        Scanner input = new Scanner(System.in);
        String nameToAdd = input.next();
        System.out.println("Please type a surname...");
        String surnameToAdd = input.next();
        System.out.println("Please type gross salary...");
        Double grossSalaryToAdd = input.nextDouble();
        while (!"END".equals(input)) {
            Employee employeeToAdd = new Employee(nameToAdd, surnameToAdd, grossSalaryToAdd);
            employeesToAdd.add(employeeToAdd);
        }
        return employeesToAdd;
    }
}