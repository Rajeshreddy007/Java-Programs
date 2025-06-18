package ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class parallelstream {
    public static void main(String[] args) {
        int size=100000;
        List<Integer> nums = new ArrayList<>();
        Random r = new Random();
        for(int i =1;i<size;i++){
            nums.add(r.nextInt(100));
        }
        long startseq=System.currentTimeMillis();
        int result1 = nums.stream()
                          .reduce(0, (c,e)->c+e);//sum all elements
        long endseq=System.currentTimeMillis();
        System.out.println("SUM : "+result1);
        System.out.println("Sequential Stream : "+(endseq-startseq));
        long startparallel=System.currentTimeMillis();
        int result2 = nums.parallelStream()
                          .reduce(0, (c,e)->c+e);//sum all elements
        long endparallel=System.currentTimeMillis();
        System.out.println("SUM : "+result2);
        System.out.println("Parallel Stream : "+(endparallel-startparallel));

    }
}
