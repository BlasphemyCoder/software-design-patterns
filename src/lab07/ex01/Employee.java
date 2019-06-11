package lab07.ex01;

import java.util.Date;

public class Employee implements EmployeeInterface {
    private Date startDate;
    private Date finishDate;
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void start(Date date) {
        this.startDate = date;
        System.out.println("Employee " + this.name + " started working at: " + this.startDate);
    }

    @Override
    public void terminate(Date date) {
        this.finishDate = date;
        System.out.println("Employee " + this.name + " stopped working at : " + this.finishDate);

    }

    @Override
    public void work() {
        System.out.println(this.name + " is working!");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
