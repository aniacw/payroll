import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    Scanner in = new Scanner(System.in);
    String input = in.next();

    public String printMainMenu(){
        System.out.println("Menu" + "\n" + "Please select one of the following options: listE, add, edit, remove, return...");
        return input + " selected";
    }

    public String printEmployeeMenu(){
        return input + " selected";
    }

    public List<Employee> addEmployeeMenu(){
        List<Employee> employeesToAdd= new ArrayList<>();
        System.out.println("Please type a name...");
        String nameToAdd = input;
        System.out.println("Please type a surname...");
        String surnameToAdd = input;
        System.out.println("Please type gross salary...");
        Double grossSalaryToAdd = in.nextDouble();
        for(int i = 1; i > employeesToAdd.size(); i++){
            Employee employeeToAdd = new Employee(nameToAdd, surnameToAdd, grossSalaryToAdd);
            employeesToAdd.add(employeeToAdd);
        }
        return employeesToAdd;
    }

    public String getInput() {
        return input;
    }

//    public void displayEmployees(){
//        if (input.equals("listE")){
//            System.out.println(employees2);
//        }
//    }

//    public void addEmployee(){
//        if (input.equals("add")){
//            System.out.println("Please type a name...");
//            String nameToAdd = input;
//            System.out.println("Please type a surname...");
//            String surnameToAdd = input;
//            System.out.println("Please type gross salary...");
//            Double grossSalaryToAdd = in.nextDouble();
//            Employee employeeToAdd = new Employee(nameToAdd, surnameToAdd, grossSalaryToAdd);
//            employees2.add(employeeToAdd);
//            System.out.println(employees2);
//        }
//    }

//    public void editEmployee(){
//        if (input.equals("edit")){
//            System.out.println("Please select the ID...");
//            Integer idToEdit = in.nextInt();
//            System.out.println("Please type new name...");
//            String newName = input;
//            System.out.println("Please type new surname...");
//            String newSurname = input;
//            System.out.println("Please type new gross salary...");
//            Double newGrossSalary = in.nextDouble();
//            employees2.get(idToEdit).getName().replaceAll("", newName);
//            employees2.get(idToEdit).getSurname().replaceAll("", newSurname);
//            employees2.get(idToEdit).setGrossSalary(newGrossSalary);
//            System.out.println(employees2);
//        }
//    }

//    public void removeEmployee(){
//        if (input.equals("remove")){
//            System.out.println("Please type ID to be removed...");
//            Integer idToRemove = in.nextInt();
//            employees2.remove(idToRemove);
//            System.out.println(employees2);
//        }
//    }

//    public void goBack(){
//        if (input.equals("return")){
//            System.out.println("Menu" + "\n" + "Please select option");
//        }
//    }
}