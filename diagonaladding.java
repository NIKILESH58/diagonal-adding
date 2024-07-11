import java.util.*;
public class diagonaladding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = in.nextInt();
        int sum=0;
        int[][] twoDArray = new int[rows][columns];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                twoDArray[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(i==j)
                 sum=sum+twoDArray[i][j];
            }
        }
        System.out.print("sum of the diagonals is: "+sum);
    }
}