import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the Array : ");
        int n = sc.nextInt();
        System.out.print("Enter Array Elements : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Element to search : ");
        int x = sc.nextInt();
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                index=i;
                break;
            }
        }
        if(index>0){
            System.out.println("Element found at index : "+index);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
