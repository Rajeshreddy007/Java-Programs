package Strings;
public class Strings {
    public static void main(String[] args) {
        System.out.println("--------String Example---------");
        String name = "Rajesh";
        String Fullname = name.concat(" Reddy"); // creating new object called Rajesh Reddy and referring to Fullname
        System.out.println(name);
        System.out.println(Fullname);
        System.out.println("--------StringBuilder Example---------");
        StringBuilder str = new StringBuilder("Rajesh");
        System.out.println(str);
        System.out.println(str.append(" Reddy")); // changing strings in same objects
        System.out.println(str.insert(0, "Kumbam "));
        System.out.println(str.insert(6, " Raja"));
        System.out.println("--------StringBuffer Example---------");
        StringBuffer str1 = new StringBuffer("Rajesh");
        System.out.println(str1);
        System.out.println(str1.append(" Reddy")); // changing strings in same objects
        System.out.println(str1.insert(0, "Kumbam "));
        System.out.println(str1.insert(6, " Raja"));
    }
}
