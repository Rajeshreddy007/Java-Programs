package Inheritance;

public class Customer extends FoodDelivery{
    private String item="Biryani";

    public String getItem() {
        return item;
    }
    public void order(String x){
        System.out.println(item+" ordered Successfully by "+x);
    }     
}
