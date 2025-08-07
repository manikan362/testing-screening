import java.util.Scanner;

public class OddNumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();

        // Print the first 'a' odd numbers
        for (int i = 0; i < a; i++) {
            int oddNumber = 2 * i + 1;
            System.out.print(oddNumber);
            if (i < a - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
==============================
output:

Enter a number (a): 6
Output: 1, 3, 5, 7, 9
