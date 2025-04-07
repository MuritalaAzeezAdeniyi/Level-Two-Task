package employee;


import java.util.ArrayList;

public class EmployeeManagement {
    ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(int id, String name,String salary,String position){
        Employee employee = new Employee(id,name,salary,position);
        employees.add(employee);
        System.out.println("Employee added Successfully");
    }
    public void removeEmployee(int id){
        for(Employee employee : employees){
            if(employee.getId() == id){
                employees.remove(employee);
            }
            return;
        }
    }

    public void viewEmployee(int id){
        for(Employee employee : employees){
            if(employee.getId() == id){
                employee.displayEmployeeInfo();
            }
            return;
        }
        System.out.println("Employee not found");
    }
    public void updateEmployee(int id, String name,String salary,String position){
        for(Employee employee : employees){
            if(employee.getId() == id){
                employee.setName(name);
                employee.setSalary(salary);
                employee.setPosition(position);
                employees.add(employee);
                System.out.println("Employee updated successfully");
            }
        }
        System.out.println("Employee not found");
    }

}
