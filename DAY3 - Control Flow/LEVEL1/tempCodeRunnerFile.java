import java.util.Scanner;

public class OdEvenUser {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int a = reader.nextInt();

        System.out.print("Even: ");
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nOdd: ");
        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        reader.close(); // Close the scanner
    }
}
