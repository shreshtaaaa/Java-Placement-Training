import java.util.Scanner;

public class occurence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        System.out.println("enter element");
        int el=sc.nextInt();
        for(int i=0;i<arr.length;i++){
               if(el == arr[i]);
               count++;
        }
        System.out.println(count);
    }
}
