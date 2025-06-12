import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Size of the Array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.print("Enter Sorted Array Elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter Element to search: ");
            int x = sc.nextInt();

            int start = 0;
            int end = arr.length - 1;
            int index = -1;

            while (start <= end) {
                int mid = (start + end) / 2;

                if (arr[mid] == x) {
                    index = mid;
                    break;
                } else if (arr[mid] > x) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            if (index >= 0) {
                System.out.println("Element found at index: " + index);
            } else {
                System.out.println("Element not found");
            }
        }
    }
}
