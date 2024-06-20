//contiguous subarray with max sum
//4 5 6 2 8 3
//4 5 6 2.. is the subarray
//4 5 2 8.. isnt a subarray
//-4 5 -6 2 -8 3
//5 -6 2 is the max subarray

import java.util.Scanner;

public class maxSum {
    public static void main(String args[]){
       Scanner s=new Scanner(System.in);
       System.out.println("enter no of elements");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter " +n+ " elements");
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int overallMax=0;
        int currentMax=0;
        for(int i=0;i<n;i++){
            if(currentMax>overallMax){
                overallMax=currentMax;
            }
            if(currentMax<0){
                currentMax=0;
            }
            currentMax=currentMax+arr[i];
        }
        System.out.println("maximux sum is: "+overallMax);
}}
