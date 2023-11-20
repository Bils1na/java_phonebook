import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public String getCommand() {
        System.out.println("Для ориентации по телефоной книге используйте команды ниже:" + 
                            "\n1. Добавить контакт \n2. Просмотреть контакт" + 
                            "\n3. Удалить контакт \n4. Обновить контакт \n5. Выход");
        return in.next();
    }

    public String[] getNewContact() {
        System.out.println("Введите имя контакта и номер через тильду( Пример: Иван~8(985)3012083 ):");
        String input = in.next();
        return input.split("~");
    }

    public String getContactName() {
        System.out.println("Введите имя контакта:");
        String input = in.next();
        return input;
    }

    public String getContactNumber() {
        System.out.println("Введите номер контакта:");
        String input = in.next();
        return input;
    }
}
