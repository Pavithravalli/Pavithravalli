class Employee {
// Attributes
private int employeeId;
private String name;
private double salary;
// Constructor
public Employee(int employeeId, String name, double salary) {
this.employeeId = employeeId;
this.name = name;
this.salary = salary;
}
// Methods
public int getEmployeeId() {
return employeeId;
}
public String getName() {
return name;
}
public double getSalary() {
return salary;
}
public void increaseSalary(double percentage) {
if (percentage > 0) {
salary += salary * (percentage / 100);
System.out.println("Salary increased by " + percentage + "%. New salary: $" + salary);
} else {
System.out.println("Invalid percentage. Salary remains unchanged.");
}
}
}
public class EmployeeExample {

public static void main(String[] args) {

// Creating employees
Employee employee1 = new Employee(1, "Selvamathi", 50000.0);
Employee employee2 = new Employee(2, " Gripsy", 60000.0);
// Displaying employee information
System.out.println("Employee 1: ID-" + employee1.getEmployeeId() + ", Name-" +
employee1.getName() + ", Salary-$" + employee1.getSalary());
System.out.println("Employee 2: ID-" + employee2.getEmployeeId() + ", Name-" +
employee2.getName() + ", Salary-$" + employee2.getSalary());
// Increasing salary for employee 1
employee1.increaseSalary(10);
// Increasing salary for employee 2 (invalid percentage)
employee2.increaseSalary(-5);
// Displaying updated employee information
System.out.println("Updated Employee 1: Salary-$" + employee1.getSalary());
System.out.println("Updated Employee 2: Salary-$" + employee2.getSalary());
}
}