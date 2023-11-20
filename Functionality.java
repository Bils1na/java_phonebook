import java.util.List;

public interface Functionality {
    void createContact(String name, String number);

    String viewContact(String name);

    void deleteContact(Contact contact);

    void updateContact(Contact contact);
}
