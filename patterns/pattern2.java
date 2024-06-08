import java.util.Scanner;

public class pattern2 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of rows");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print(j+1);
                }
                System.out.println("");
        }
    }
}
