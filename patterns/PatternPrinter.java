import java.util.Scanner;

public class PatternPrinter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Print first pattern
        System.out.println("First Pattern:");
        printPattern1();
        
        // Print second pattern
        System.out.println("\nSecond Pattern:");
        printPattern2();
        
        scanner.close();
    }
    
    public static void printPattern1() {
        int n = 3; // Size of the pattern
        int[][] pattern = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 1 && j == 1) {
                    pattern[i][j] = 1;
                } else {
                    pattern[i][j] = 2;
                }
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }

    public static void printPattern2() {
        int n = 5; // Size of the pattern
        int[][] pattern = new int[n][n];
        int mid = n / 2;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pattern[i][j] = 3;
            }
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int minDistance = Math.min(Math.min(i, j), Math.min(n - i - 1, n - j - 1));
                pattern[i][j] = 3 - minDistance;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }
}
