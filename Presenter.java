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
                    System.out.println(pb.viewContact(view.getContactName()));
                    break;
                case "3":
                    pb.deleteContact(view.getContactName());
                    System.out.println("Контакт удален!");
                    break;
                case "4":
                    pb.updateContact(view.getContactName(), view.getContactNumber());
                    break;
                case "5":
                    work = false;
            }
        }
    }
}
