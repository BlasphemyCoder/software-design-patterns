package ex02;
import java.util.List;

import java.util.ArrayList;
import java.util.Collections;

class Company {
    public static User user;
    private List<Employee> emps = new ArrayList<>();
    
    private List<EmployeeCard> empsCards = new ArrayList<>();
    private Insurance insurance = new Insurance();
    private Parking parking = new Parking();

    public void admitEmployee(Person person, double salary){
        Employee e = new Employee(person,salary);
        emps.add(e);

        //Social Security registree
        SocialSecurity.regist(person);
        System.out.println(SocialSecurity.getRegistrations());

        //Note: I choose to make SocialSecurity a static class on the basis that,
        //unlike the insurance which can be different for each company, the SS should stay the same
        //so I didn't want to create a new instance of it on every company. I also didn't want to pass it
        //as an argument and create it in the main because that would add some more "complexity" to the façade,
        //forcing the user to pass an extra argument to use the admitEmployee method
        
        //Insurance company registree
        insurance.regist(person);

        //Card Creation 
        empsCards.add(new EmployeeCard(person));

        //Allow Parking processing
        double avg = getSalaryAverage();
        if(salary>avg){
            parking.allow(person);
        }
    }

    //Calculates the average salary with the current employees
    public double getSalaryAverage(){
        double sum = 0;
        for (Employee i : emps){
            sum += i.getSalary();
        }
        return sum/emps.size() ;
    }

    public void paySalaries(int month) {
        for (Employee e : emps) {
            BankAccount ba = e.getBankAccount();
            ba.deposit(e.getSalary());
        }
    }

    public List<Employee> employees() {
        return Collections.unmodifiableList(emps);
    }
}