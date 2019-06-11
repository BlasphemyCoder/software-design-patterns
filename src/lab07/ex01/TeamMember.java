package lab07.ex01;

public class TeamMember extends EmployeeDecorator {
    public TeamMember(EmployeeInterface e) {
        super(e);
    }

    public void colaborate() {
        System.out.println(super.getName() + " is helping with work!");
    }
}
