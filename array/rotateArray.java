//rotate array by one pos clockwise

import java.util.Scanner;

public class rotateArray {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int l=arr.length;
        int end=arr[l-1];
        
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=end;
        
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
