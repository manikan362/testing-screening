import java.util.*;

public class MultiplesCounter {
    public static void main(String[] args) {
        // Input list
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Create a map to store counts for 1 to 9
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        // Initialize map with 0 for 1 to 9
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Check each number in the list
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        // Print result
        System.out.println("Output:");
        System.out.println(countMap);
    }
}
===============================================
  output:
Output:
{1=11, 2=8, 3=4, 4=4, 5=3, 6=2, 7=0, 8=1, 9=1}
