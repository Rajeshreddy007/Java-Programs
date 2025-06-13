package Exception_Handling;

public class MyExceptionHandling {
    public void div() throws ArithmeticException {
        int a = 10;
        int b = 0;
        System.out.println("Division : " + (a / b));
    }

    public void access() throws IndexOutOfBoundsException {
        int[] arr = {1, 2, 3};
        System.out.println("Element : " + arr[5]);
    }

    public static void main(String[] args) {
        MyExceptionHandling obj = new MyExceptionHandling();

        try {
            obj.div();
        } catch (ArithmeticException e) {
            System.out.println("Not divisible with zero");
        }

        try {
            obj.access();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Access outside the limit");
        }
    }
}
