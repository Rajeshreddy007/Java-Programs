package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AList{
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(23);
        nums.add(15);
        nums.add(19);
        nums.add(30);

        System.out.println(nums.size());
        System.out.println(nums);
        nums.add(2, 20);// add element at particular index
        System.out.println("Size of the Array after Adding Element : "+nums.size());//returns size of the array
        System.out.println("New Array List : "+nums);
        nums.remove(4);//removing element
        System.out.println("After removing Element : "+nums);
        Collections.sort(nums);//sorting
        System.out.println("Sorted Array : "+nums);
    }
}