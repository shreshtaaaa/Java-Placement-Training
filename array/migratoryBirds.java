// //find most frequently found word
// //birds={1,2,1,3,1,2,1,4}
// import java.util.Arrays;
// import java.util.Scanner;

// public class migratoryBirds {
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//             int n=sc.nextInt();
//             int[] birds=new int[n];
//             for(int i=0;i<n;i++){
//                 birds[i]=sc.nextInt();
//             }
//             Arrays.sort(birds);
//             for(int i=0;i<n;i++)
//             System.out.print(birds[i]);
            
//             int count=0;
//             for(int i=0;i<n-1;i++){
//                 if(birds[i]==birds[i+1]){
//                     count++;
//                 }
//             }
//             System.out.println("count"+count);
//         }   
//     }

import java.util.Scanner;
    import java.util.Arrays;

public class migratoryBirds {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of elements");
             int n=sc.nextInt();
             int[] birds=new int[n];
             System.out.println("enter " +n+ " elements");
             for(int i=0;i<n;i++){
                 birds[i]=sc.nextInt();
             }

        // Find the most frequent element
        int mostFrequent = findMostFrequent(birds);

        // Print the most frequent element
        System.out.println("The most frequently found word (number) is: " + mostFrequent);
    }

    public static int findMostFrequent(int[] arr) {
        // Sort the array
        Arrays.sort(arr);

        int maxCount = 1;
        int currentCount = 1;
        int mostFrequent = arr[0];
        int currentElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == currentElement) {
                currentCount++;
            } else {
                currentElement = arr[i];
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostFrequent = arr[i];
            }
        }

        return mostFrequent;
    }
}
