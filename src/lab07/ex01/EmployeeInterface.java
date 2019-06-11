package lab07.ex01;

import java.util.Date;

public interface EmployeeInterface {
    void start(Date d);

    void terminate(Date d);

    void work();

    String getName();
}
