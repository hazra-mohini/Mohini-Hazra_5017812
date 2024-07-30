package EmployeeManagementSystem;

public class Management {
    private Employee[] employees;
    private int count;

    public Management(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public boolean addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
            return true;
        }
        return false;
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Management management = new Management(10);
        management.addEmployee(new Employee(1, "Moni Pal", "Developer", 50000));
        management.addEmployee(new Employee(2, "Soumi Sen", "Manager", 60000));
        management.addEmployee(new Employee(3, "Sagnik Roy", "Designer", 55000));

        int searchId = 2;
        Employee foundEmployee = management.searchEmployee(searchId);

        if (foundEmployee != null) {
            System.out.println("Found Employee: " + foundEmployee);
        } else {
            System.out.println("Employee not found with ID: " + searchId);
        }
    }
}
