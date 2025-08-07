import java.util.Scanner;

public class OddNumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: a
        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();

        System.out.print("Output: ");
        int num = 1;

        for (int i = 0; i < a; i++) {
            System.out.print(num);
            if (i < a - 1) {
                System.out.print(", ");
            }
            num += 2; // move to next odd number
        }

        scanner.close();
    }
}
==============================================================================
output:
Enter a number (a): 4
Output: 1, 3, 5, 7
