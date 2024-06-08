//calculate stock span

import java.util.Scanner;

public class stockSpan {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int span=0;
        System.out.println(span+" ");
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--)
            if(arr[i]<arr[j]){
               break;
            }
            else{
                span++;
            }
        }
        System.out.println(span+" ");
        span=1;
    }
}
//stock span is the number of previous consecutive days plus current day in which the price should be equal or less than the current price
