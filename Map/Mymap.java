package Map;
import java.util.HashMap;
import java.util.Map;

public class Mymap {
    public static void main(String[] args) {
        Map<String,Integer> age = new HashMap<>();
        age.put("Rajesh", 20);
        age.put("Robert", 23);
        age.put("petter", 30);
        age.put("James", 23);
        age.put("Rajesh", 21);//Updates Value
        System.out.println(age);
        age.replace("petter", 28);
        System.out.println(age);
    }
}
