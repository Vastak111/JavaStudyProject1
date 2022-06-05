public class EmployeePrinter implements Printer {

    @Override
    public void print(Employee employee) {
        System.out.println("The first name of the employee is " + employee.firstName);
        System.out.println("The last name of the employee is " + employee.lastName);
        System.out.println("The age of the employee is " + employee.age);
    }
}
