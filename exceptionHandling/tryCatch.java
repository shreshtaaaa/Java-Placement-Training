// run time errors are called exceptions
//exception handling--> to make eceptions user friendly, 
//try block--> which generates the exception
//catch block--> which handles hte exception
//finally block--> closing block.. not necessary at all times..it will always be executed even if catch doesnt execute

import java.util.Scanner;

public class tryCatch {
    public static void main(String args[]){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the first number:");
            int a=sc.nextInt();
            System.out.println("Enter the second number:");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println(c);

        }
        catch(ArithmeticException e){
            System.out.println("cant divide by 0");
        }
        finally{
            System.out.println("exeception handled");
        }
    }
}
