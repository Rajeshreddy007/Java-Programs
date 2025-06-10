public class Method_Overloading {
    public int large(int a, int b){
        if(a>b){
            return a;
        }
        else if(b>a){
            return b;
        }
        else{
            return -1;
        }
    }
    public int large(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else if(c>a && c>b){
            return c;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Method_Overloading obj=new Method_Overloading();
        int result = obj.large(1,0,-2);
        if(result==-1){
            System.out.println("All are equal");
        }
        else System.out.println(result);
    }
}
