// import java.util.Scanner;

// public class pattern3 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int n = scanner.nextInt();
//         int number = 1;

//         for (int i = 1; i <= n; i++) {
//             // Print leading spaces
//             for (int j = i; j < n; j++) {
//                 System.out.print("  ");
//             }
//             // Print numbers
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 System.out.print(number + " ");
//                 number++;
//             }
//             // Move to the next line
//             System.out.println();
//         }

//         scanner.close();
//     }
// }



import java.util.Scanner;

public class pattern3 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of rows");
        int n=s.nextInt();
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print(count);
                count++;
                }
                System.out.println("");
        }
    }
}

