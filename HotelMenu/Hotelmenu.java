package HotelMenu;
import java.util.*;

class Admin {
    Map<String, Integer> menu = new HashMap<>();
    public void Put(String x, Integer n) {
        menu.put(x, n);
    }
    public void display() {
        System.out.println(menu);
    }
}

public class Hotelmenu {
    public static void main(String[] args) {
        Admin obj = new Admin();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Menu Details");
            while (true) {
                System.out.print("Enter key (or 'done'): ");
                String key = sc.nextLine();
                if (key.equalsIgnoreCase("done")) {
                    break;
                }
                System.out.print("Enter value: ");
                Integer value = sc.nextInt();
                sc.nextLine();
                obj.Put(key, value);
            }
            obj.display();
        }
    }
}
