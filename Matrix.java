import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Matrix1[][] = new int[2][2];
        int Matrix2[][] = new int[2][2];

        System.out.println("Enter Matrix1 elements: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Matrix2 elements: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Matrix2[i][j] = sc.nextInt();
            }
        }

        int result[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    result[i][j] += Matrix1[i][k] * Matrix2[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix after multiplication:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
