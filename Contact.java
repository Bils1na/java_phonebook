import java.util.ArrayList;
import java.util.List;

public class Contact {
    public String name;
    public List<String> numbers;

    public Contact(String name, String number) {
        this.name = name;
        this.numbers = new ArrayList<>();
        numbers.add(number);
    }

    @Override
    public String toString(){
        return String.format("%s: %s", name, numbers);
    }
}
