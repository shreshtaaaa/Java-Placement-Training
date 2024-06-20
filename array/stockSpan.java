//calculate stock span

import java.util.Scanner;

public class stockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] span = new int[n];
        for (int i = 0; i < n; i++) {
            span[i] = 1; // Every stock price has a minimum span of 1 (itself)
            for (int j = i - 1; j >= 0 && arr[i] >= arr[j]; j--) {
                span[i]++;
            }
        }

        System.out.println("The spans are:");
        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }
        sc.close();
    }
}

//stock span is the number of previous consecutive days plus current day in which the price should be equal or less than the current price
