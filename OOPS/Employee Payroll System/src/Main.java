import java.util.ArrayList;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id){
        this.name= name;
        this.id= id;
    }
    
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString(){
        return "Employee [name= " + name + ", id= " + id + ", salary= " + calculateSalary() + "]";
    }
}

class FullTimeEmployee extends Employee{
    private double montholySalary;

    public FullTimeEmployee (String name, int id, double montholySalary){
        // super as we want to run constructor of parent class
        super(name, id);
        this.montholySalary= montholySalary;
    }

    @Override
    public double calculateSalary(){
        return montholySalary;
    }
}

class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee (String name, int id, int hoursWorked, double hourlyRate){
        // super as we want to run constructor of parent class
        super(name, id);
        this.hoursWorked= hoursWorked;
        this.hourlyRate= hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }
}

class PayrollSystem{
    private ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList= new ArrayList<Employee>();
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(int id){
        Employee employeeToRemove= null;
        for (Employee employee : employeeList) {
            if(employee.getId()==id){
                employeeToRemove= employee;
                break;
            }
        }
        if(employeeToRemove!=null)
            employeeList.remove(employeeToRemove);
    }
    public void displayEmployees(){
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem= new PayrollSystem();
        FullTimeEmployee emp1= new FullTimeEmployee("Pearl", 1, 80000);
        PartTimeEmployee emp2= new PartTimeEmployee("Riya", 2, 40, 150);
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initial Employee Details: ");
        payrollSystem.displayEmployees();
        payrollSystem.removeEmployee(2);
        System.out.println("Remaining Employee Details: ");
        payrollSystem.displayEmployees();
    }
}
