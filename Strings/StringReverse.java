package Strings;
public class StringReverse {
    public static void main(String[] args) {
        System.out.println("-----Stringbuffer Example-----");
        StringBuffer str= new StringBuffer("Rajesh");
        System.out.println(str.reverse());
        System.out.println("-----String Example-----");
        String arr = "java";
        char[] rev=new char[arr.length()];
        for(int i=1;i<=arr.length();i++){
            rev[i-1]=arr.charAt(arr.length()-i);
        }
        System.out.println(rev);
    }
}
