import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_API{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,4,3,6,5);
        Stream<Integer> n1 = nums.stream();
        Stream<Integer> n2 = n1.sorted(); //Streams are used to do operations with copy of the original data 
        int result = n2.reduce(0, (c,e)->c+e);//logic for addition of all elements in lista
        System.out.println(result);
        //n1.forEach(x-> System.out.println(x)); each stream is valid for one time usage

        int result1 = nums.stream()// Another Way of doing same Operation
                         .sorted()
                         .reduce(0, (c,e)->c+e);

        System.out.println(result1);
    }
}