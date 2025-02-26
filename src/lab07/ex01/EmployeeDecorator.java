package lab07.ex01;

import java.util.Date;

public abstract class EmployeeDecorator implements EmployeeInterface {
    private EmployeeInterface employee;

    EmployeeDecorator(EmployeeInterface e) {
        this.employee = e;
    }

    public void start(Date d) {
        this.employee.start(d);
    }

    public void terminate(Date d) {
        this.employee.terminate(d);
    }

    public void work() {
        this.employee.work();
    }

    public String getName() {
        return this.employee.getName();
    }

}
