public interface Functionality {
    void createContact(String name, String number);

    String viewContact(String name);

    void deleteContact(String name);

    void updateContact(String name, String number);
}
