//user defined exceptions(custom exception)
//classes already available-exception,arithmeticexception,iuexception,filenotfoundexception,
//arrayindexoutofboundexception-> pre defined exceptions

import java.util.*;
class InvalidAge extends Exception{

}

public class problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int age=sc.nextInt();
        if(age<18){
            try
            {
                throw new InvalidAge();
            }
            catch(InvalidAge e){
                System.out.println("not eligible");
            }
        }
        else{
            System.out.println("welcome to vote");
        }
    }
}
