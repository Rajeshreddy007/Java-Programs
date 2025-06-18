package OptionalString_Class;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;//optional stringclass imports

public class Opstringclass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kumbam","Raja","Rajesh","Reddy");
        Optional<String> n = names.stream()//optional string
                                .filter(str->str.contains("y"))
                                .findFirst();
        System.out.println(n.orElse("Not Found"));//if no name contains y letter it prints Not Found
    }
}
