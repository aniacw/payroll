import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    private static final List<String> allowedCommands = Arrays.asList("listE", "add", "edit", "remove", "return", "save");
    String command = "";

    public String printMainMenu() {
        System.out.println("Menu" + "\n" + "Please select one of the following options: listE, add, edit, remove, return, save...");
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
    List<Employee> employeesToAdd = new ArrayList<>();
    public List<Employee> addEmployeeMenu() {

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

    public List<Employee> getEmployeesToAdd() {
        return employeesToAdd;
    }

    private Employee employeeToEdit;
    private Integer idToEdit;
    private String newName;
    private String newSurname;
    private Double newGrossSalary;

    public void editEmployeeMenu() {
        System.out.println("Please select the ID...");
        Scanner editScanner = new Scanner(System.in);
        idToEdit = editScanner.nextInt();
        System.out.println("Please type new name...");
        newName = editScanner.next();
        System.out.println("Please type new surname...");
        newSurname = editScanner.next();
        System.out.println("Please type new gross salary...");
        newGrossSalary = editScanner.nextDouble();
        while (!"END".equals(editScanner)) {
            employeeToEdit = new Employee(newName, newSurname, newGrossSalary);
        }
    }

    public Employee getEmployeeToEdit() {
        return employeeToEdit;
    }

    public Integer getIdToEdit() {
        return idToEdit;
    }

    public String getNewName() {
        return newName;
    }

    public String getNewSurname() {
        return newSurname;
    }

    public Double getNewGrossSalary() {
        return newGrossSalary;
    }

    private Integer idToRemove;

    public void removeEmployeeMenu() {
        System.out.println("Please type ID to be removed...");
        Scanner removeScanner = new Scanner(System.in);
        idToRemove = removeScanner.nextInt();
    }

    public Integer getIdToRemove() {
        return idToRemove;
    }
}