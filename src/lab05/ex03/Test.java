package lab05.ex03;

public class Test {

    public static void main(String[] args) {
        Person p = new Person.Builder("Vasco", "Ramos", false).middleName("A. L.").
                suffix("Engineer").isEmployed(false).city("Canas de Senhorim").state("Viseu").build();
        System.out.println(p);
    }
}
