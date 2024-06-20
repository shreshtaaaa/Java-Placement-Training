import java.util.Scanner;

public class occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to count its occurrences:");
        int el = sc.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                count++;
            }
        }

        System.out.println("The element " + el + " occurs " + count + " times.");

        sc.close();
    }
}
