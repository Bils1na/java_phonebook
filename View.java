import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public String getCommand(String command) {
        System.out.println("Для ориентации по телефоной книге используйте команды ниже:" + 
                            "\n1. Добавить контакт \n2. Просмотреть контакт" + 
                            "\n3. Удалить контакт \n4. Обновить контакт");
        return in.next();
    }
}
