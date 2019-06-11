package lab07.ex01;

public class TeamLeader extends EmployeeDecorator {
    public TeamLeader(EmployeeInterface e) {
        super(e);
    }

    public void plan() {
        System.out.println(super.getName() + " is planning work");
    }
}
