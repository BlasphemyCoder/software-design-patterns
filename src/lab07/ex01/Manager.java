package lab07.ex01;

public class Manager extends EmployeeDecorator {
    public Manager(EmployeeInterface e) {
        super(e);
    }


    public void manage() {
        System.out.println(super.getName() + " is managing work!");
    }
}
