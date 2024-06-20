//reversing an array

import java.util.Scanner;

public class reverseArray {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter " +n+ " elements");
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("reversed array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//implementation of arrays
//int arr[]={3,6,2,1,4,0}; size=6
//int arr[]=new int[5];

