import java.util.Scanner;

public class A2D {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[][] number = new int[3][3]; // 2D array
        int[] array = new int[3 * 3];  // 1D array of size 9

        // Taking input for the 2D array
        System.out.println("Enter 9 numbers for the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                number[i][j] = reader.nextInt();
            }
        }

        // Converting 2D array to 1D array
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[index++] = number[i][j]; // Copying elements
            }
        }

        // Printing the 1D array
        System.out.println("The 1D array is:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        reader.close(); // Close scanner
    }
}
