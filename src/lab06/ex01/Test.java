package lab06.ex01;

public class Test {
    public static void main(String[] args) {
        // Sweets Employees
        Database db = new Database();
        Employee emp1 = new Employee("Vasco", 100, 42145.4);
        Employee emp2 = new Employee("Diogo", 101, 20522.50);
        db.addEmployee(emp1);

        //Petiscos Employees
        Registos reg = new Registos();
        Empregado petEmp1 = new Empregado("Pedro", "Escaleira", 1000, 1313.33);
        Empregado petEmp2 = new Empregado("Miguel", "Mota", 1001, 2345.99);
        reg.insere(petEmp1);

        //New Company
        CompAdapter companyStaff = new CompAdapter(db, reg);
        companyStaff.addEmployee(emp2);
        companyStaff.addEmpregado(petEmp2);
        System.out.println("Current Staff:");
        companyStaff.printAllEmployees();

        System.out.println();

        System.out.printf("Vasco belongs to Company: %s\n", companyStaff.belongs(100));

        System.out.printf("Pedro Escaleira belongs to Company: %s\n", companyStaff.belongs(1001));

        System.out.println("\nRemoving employee Pedro Escaleira:");
        companyStaff.removeEmployee(1001);

        System.out.printf("Pedro Escaleira belongs to Company: %s\n", companyStaff.belongs(1001));
    }
}
