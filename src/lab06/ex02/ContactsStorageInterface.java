package lab06.ex02;

import java.util.List;

public interface ContactsStorageInterface {
    List<Contact> loadContacts();

    boolean saveContacts(List<Contact> list);
}
