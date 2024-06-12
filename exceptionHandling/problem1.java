/* write a java prgm to validate a method that taken integer value as a parameter,if the age is
 * lesss than 18 it throws exception. also write try and cathc to handle else send msg "welcomme to vote" 
 */

import java.util.Scanner;

 class problem1{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        
            if(age<18)
            {
                try
               {
                throw new Exception();
            }
               catch(Exception e)
               {
                System.out.println("you are not eligible to vote");
               }
            }
            else{
                System.out.println("Welcome to vote");
            }
    }
 }