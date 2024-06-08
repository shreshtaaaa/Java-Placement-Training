//rotate array by one pos anticlockwise

import java.util.Scanner;

public class rotateArray2{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int l=arr.length;
        int first=arr[0];
        
        for(int i=0;i<n;i++){
            arr[i]=arr[i+1];
        }
        arr[l-1]=first;
        
        for(int i=0;i<n-1;i++)
        System.out.print(arr[i]+" ");
    }
}
