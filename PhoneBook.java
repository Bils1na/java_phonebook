import java.util.ArrayList;
import java.util.List;

public class PhoneBook implements Functionality {
    public List<Contact> phonebook;

    public PhoneBook() {
        this.phonebook = new ArrayList<>();
    }

    @Override
    public void createContact(Contact contact) {
        phonebook.add(contact);
    }

    @Override
    public String viewContact() {
        return String.format("%s: %s", phonebook, phonebook);
    }

    @Override
    public void deleteContact(Contact contact) {
    }

    @Override
    public void updateContact(Contact contact) {
    }

    
}
