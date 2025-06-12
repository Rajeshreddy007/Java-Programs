class Ride {
    public void fare(){
        System.out.println("Fare : 250");
    }
}
class Bikeride extends Ride{
    public void fare(){
        System.out.println("Bike Fare : 350");
    }
}
class Carride extends Bikeride{
    public void fare(){
        System.out.println("Car Fare : 500");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
     Carride obj=new Carride();
     obj.fare(); 
    }
}
