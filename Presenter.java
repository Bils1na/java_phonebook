public class Presenter {
    View view;
    PhoneBook pb;

    public Presenter(View view, PhoneBook pb) {
        this.view = view;
        this.pb = pb;
    }

    public void startWork() {
        boolean work = true;
        String contact;

        while (work) {
            String command = view.getCommand();

            switch (command) {
                case "1": 
                    String[] contact_data = view.getNewContact();
                    pb.createContact(contact_data[0], contact_data[1]);
                    break;
                case "2":
                    contact = view.getContactName();
                    System.out.println(pb.viewContact(contact));
                    break;
                case "3":
                    contact = view.getContactName();
                    pb.deleteContact(contact);
                    System.out.println("Контакт удален!");
                    break;
                case "4":
                    contact = view.getContactName();
                    String newNumber = view.getContactNumber();
                    pb.updateContact(contact, newNumber);
                    break;
                case "5":
                    work = false;
            }
        }
    }
}
