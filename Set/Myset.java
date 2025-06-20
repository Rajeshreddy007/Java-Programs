package Set;
import java.util.HashSet;
import java.util.Set;

public class Myset {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<Integer>();
        num.add(4);
        num.add(7);
        num.add(9);
        num.add(5);
        num.add(4);//Unique elements to be added
        System.out.println(num);// no specific order for retrivel
        System.out.println(num.contains(9));
    }
}
