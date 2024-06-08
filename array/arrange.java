//arrange an array having equal no of neg and pos integers in such a way that neg nos lies left corner and pos lies right corner
//input 4,6,-3,-4,9,-2
//output -3,-4,-2,4,6,9

import java.util.Scanner;

public class arrange {
    public static void main(String args[]){
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int end=arr.length-1;
        int start=0;
        while(start<end)
        {if(arr[start]>0 & arr[end]<0){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        if(arr[start]>0 & arr[end]>0){
            end--;
        }
        if(arr[start]<0 & arr[end]<0){
            start++;
        }
        if(arr[start]<0 & arr[end]>0){
            start++;
            end--;
    }}
        for(int i : arr)
        System.out.print(i+" ");
        }
}
