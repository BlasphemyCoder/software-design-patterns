package ex02;

class EmployeeCard{
    private String name;

    EmployeeCard(Person p){
        this.name = p.getName();
    }
    public String getName(){
        return this.name;
    }
}