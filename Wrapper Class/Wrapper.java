public class Wrapper{
    public static void main(String[] args) {
        int a=10;
        Integer b=a;//Wrapper class - Autoboxing

        int c=b; // Auto-Unboxing
        System.out.println(c);

        String x="4";
        int y=Integer.parseInt(x);
        System.out.println(y);
    }
}