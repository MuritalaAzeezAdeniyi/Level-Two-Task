package employee;

import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagement management = new EmployeeManagement();

        while (true){
            System.out.println("/n Management Employee System");
            System.out.println("1. Create Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. View Employee");
            System.out.println("4. Update Employee");
            System.out.println("5.View All Employees");
            System.out.println("6. Exit");
            System.out.println("Select your choice");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter employee name");
                    String employeeName = scanner.next();
                    System.out.println("Enter employee Salary");
                    double employeeSalary = scanner.nextDouble();
                    System.out.println("Enter employee Position");
                    String employeePosition = scanner.next();
                    management.addEmployee(employeeName, employeeSalary, employeePosition);
                    break;
                case 2:
                    System.out.println("Enter employee id");
                    int employeeId = scanner.nextInt();
                    management.removeEmployee(employeeId);
                    break;
                case 3:
                    System.out.println("Enter employee id");
                    int Id = scanner.nextInt();
                    management.viewEmployee(Id);
                case 4:
                    System.out.println("Enter employee id");
                    int EmployeeId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter employee name");
                    String EmployeeName = scanner.nextLine();
                    System.out.println("Enter employee Salary");
                    double EmployeeSalary = scanner.nextDouble();
                    System.out.println("Enter employee position");
                    String EmployeePosition = scanner.nextLine();
                    management.updateEmployee(EmployeeId, EmployeeName, EmployeeSalary, EmployeePosition);
                    break;
                case 5:
                    management.viewAllEmployees();
                    break;

                case 6:
                    System.out.println("Exit");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }


    }
}
