package lab06.ex01;

import java.util.Vector;

public class Database {
    private Vector<Employee> employees; // Stores the employees

    public Database() {
        employees = new Vector<>();
    }

    public boolean addEmployee(Employee employee) {
        employees.add(employee);
        return true;
    }

    public void deleteEmployee(long emp_num) {
        employees.removeIf(b->b.getEmpNum() == emp_num);
    }

    public Employee[] getAllEmployees() {
        return (Employee[]) employees.toArray(new Employee [employees.size()]);
    }
}
