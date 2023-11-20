import java.util.ArrayList;
import java.util.List;

public class PhoneBook implements Functionality {
    public List<Contact> phonebook;

    public PhoneBook() {
        this.phonebook = new ArrayList<>();
    }

    @Override
    public void createContact(String name, String number) {
        Contact contact = new Contact(name, number);
        phonebook.add(contact);
    }

    @Override
    public String viewContact(String name) {
        for (Contact contact : phonebook) {
            if ((contact.name).equals(name)) {
                return String.format("%s: %s", contact.name, contact.numbers);
            }
        }
        return "Контакт не найден";
        // return phonebook;
    }

    @Override
    public void deleteContact(Contact contact) {
    }

    @Override
    public void updateContact(Contact contact) {
    }

    
}
