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

        System.out.println("Menu" + "\n" + "Please select option");
        Scanner in = new Scanner(System.in);
        String input = in.next();

        if (input.equals("listE")) {
            System.out.println(employees);
        }
        if (input.equals("add")){
           Scanner inName = new Scanner(System.in);
           String nameToAdd = inName.next();
           Scanner inSurname = new Scanner(System.in);
           String surnameToAdd = inSurname.next();
           Scanner inGrossSalary = new Scanner(System.in);
           Double grossSalaryToAdd = inGrossSalary.nextDouble();
           Employee employeeToAdd = new Employee(nameToAdd, surnameToAdd, grossSalaryToAdd);
           employees.add(employeeToAdd);
            System.out.println(employees);
        }

        if (input.equals("edit")){
            Scanner inId = new Scanner(System.in);
            Integer idToEdit = inId.nextInt();
            Scanner inName = new Scanner(System.in);
            String nameToEdit = inName.next();
            Scanner inSurname = new Scanner(System.in);
            String surnameToEdit = inSurname.next();
            Scanner inGrossSalary = new Scanner(System.in);
            Double grossSalaryToEdit = inGrossSalary.nextDouble();
            employees.get(idToEdit).getName().replaceAll("", nameToEdit);
            employees.get(idToEdit).getSurname().replaceAll("", surnameToEdit);
            employees.get(idToEdit).setGrossSalary(grossSalaryToEdit);
            System.out.println(employees);
        }

        if (input.equals("remove")){
            Scanner inId = new Scanner(System.in);
            Integer idToRemove = inId.nextInt();
            employees.remove(idToRemove);
            System.out.println(employees);
        }

        if (input.equals("back")){
            System.out.println("Menu" + "\n" + "Please select option");
        }
    }
}
