public class Programm {
    public static void main(String[] args) {
        Presenter p = new Presenter(new View(), new PhoneBook());

        p.startWork();
    }
}
