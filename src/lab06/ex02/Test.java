package lab06.ex02;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Contact> ola = new ArrayList<>();
        BinaryStorage txSt = new BinaryStorage("save.txt");
        ContactsList phone = new ContactsList(txSt);
        Contact ca = new Contact("Maria", 91222);
        phone.add(new Contact("Joaquim", 91123));
        phone.add(new Contact("Alberto", 9123));
        phone.add(new Contact("Joao", 9145));
        phone.add(ca);
        Contact ct = new Contact("Mario", 91222);
        phone.remove(ca);
        phone.saveAndClose();
        System.out.println(phone.exist(ct));
        System.out.println(phone.getByName("Joaquim"));
        phone.openAndLoad(txSt);
    }
}
