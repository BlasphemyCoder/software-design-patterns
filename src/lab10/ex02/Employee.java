package ex02;

abstract class Employee {
    protected String name;
    public abstract String getName();
} 


class Programmer extends Employee {
    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class NullEmployee extends Employee{
    public NullEmployee(String name){
        this.name = name;
    }

    public String getName(){
        return "Error: Inexistent employee for \"" + this.name + "\"";
    }
}