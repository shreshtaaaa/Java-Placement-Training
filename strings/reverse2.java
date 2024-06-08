import java.util.Arrays;
import java.util.Scanner;


public class reverse2 {
    
    public static void main(String args[]){
         Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String st[] =str.split(" ");
        System.out.println(Arrays.toString(st));

        int start=0;
        int end=st.length-1;
        while(start<end){
            String temp=st[start];
            st[start]=st[end];
            st[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(st));
    }
}
