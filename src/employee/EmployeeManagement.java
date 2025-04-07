package employee;


import java.util.ArrayList;

public class EmployeeManagement {
    ArrayList<Employee> employees = new ArrayList<>();
       private int nextId = 1;

    public void addEmployee(String name,double salary,String position){
        Employee employee = new Employee(nextId++,name,salary,position);
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
    public void updateEmployee(int id, String name,double salary,String position){
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

    public void viewAllEmployees(){
        if(employees.isEmpty()){
            System.out.println("Employee not found");
            return;
        }

        for(Employee employee : employees){
            employee.displayEmployeeInfo();
        }
    }

}
