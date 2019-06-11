package lab06.ex01;

import java.util.Iterator;

public class CompAdapter {

    private Database db;
    private Registos rg;

    public CompAdapter(Database db, Registos rg) {
        this.db = db;
        this.rg = rg;
    }

    public boolean addEmployee(Employee emp) {
        return this.db.addEmployee(emp);
    }

    public void addEmpregado(Empregado emp) {
        this.rg.insere(emp);
    }

    public void removeEmployee(int code) {
        this.db.deleteEmployee(code);
        this.rg.remove(code);
    }

    public boolean belongs(int code) {
        if (this.rg.isEmpregado(code)) {
            return true;
        }

        for(Employee i : this.db.getAllEmployees()){
            if (i.getEmpNum() == code){
                return true;
            }
        }

        return false;
    }

    public void printAllEmployees(){
        for(Employee emp : this.db.getAllEmployees()){
            System.out.println(emp.getName());
        }
        for(Empregado emp : this.rg.listaDeEmpregados()){
            System.out.println(emp.nome() + " " + emp.apelido());
        }
    }
}
