import java.util.Scanner;

public class pattern4 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of rows");
        int n=s.nextInt();
        int len=2*n-1;
        int min=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                min=(i<j)?i:j;
                min=(min<len-i)?min:len-i-1;
                min=(min<len-j-1)?min:len-j-1;
                System.out.print(n-min);
            }
            System.out.println(" ");
        }
    }
}
