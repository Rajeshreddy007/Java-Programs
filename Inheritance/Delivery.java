package Inheritance;
public class Delivery extends Customer {
    private String name="Rolex";

    public void delivery(){
        System.out.println("Order Delivered by : "+name);
    }
    public static void main(String[] args) {
        Delivery obj = new Delivery();
        obj.show();
        obj.order(obj.getUser_name());
        obj.delivery();
    }
}
