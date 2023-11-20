import java.util.Arrays;

public class Presenter {
    View view;
    PhoneBook pb;

    public Presenter(View view, PhoneBook pb) {
        this.view = view;
        this.pb = pb;
    }

    public void startWork() {
        boolean work = true;

        while (work) {
            String command = view.getCommand();

            switch (command) {
                case "1": 
                    String[] contact_data = view.getNewContact();
                    pb.createContact(contact_data[0], contact_data[1]);
                    break;
                case "2":
                    String contact = view.getContactName();
                    System.out.println(pb.viewContact(contact));
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    work = false;
            }
        }
    }
}
