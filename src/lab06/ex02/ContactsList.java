package lab06.ex02;

import java.util.ArrayList;
import java.util.Iterator;

public class ContactsList implements ContactsInterface {

    private ContactsStorageInterface storage;
    private ArrayList<Contact> cache = new ArrayList<>();

    public ContactsList(ContactsStorageInterface storage) {
        this.storage = storage;
    }

    @Override
    public void openAndLoad(ContactsStorageInterface store) {
        cache = (ArrayList<Contact>) store.loadContacts();
    }

    @Override
    public void saveAndClose() {
        this.storage.saveContacts(cache);
    }

    @Override
    public void saveAndClose(ContactsStorageInterface store) {
        store.saveContacts(cache);
    }

    @Override
    public boolean exist(Contact contact) {
        boolean check = cache.contains(contact);

        return check;
    }

    @Override
    public Contact getByName(String name) {
        Iterator<Contact> it = cache.listIterator();
        while (it.hasNext()) {
            Contact temp = it.next();
            if (name == temp.getName()) ;
            return temp;
        }

        return null;
    }

    @Override
    public boolean add(Contact contact) {
        cache.add(contact);
        return true;
    }

    @Override
    public boolean remove(Contact contact) {
        boolean check = cache.removeIf(b -> b == contact);

        return check;
    }

}
