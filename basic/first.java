
//business logic class.. this wont be available in the memory

import java.util.Scanner;

class display{
    int show(int x,int y){
    //System.out.println("hello world");
   int z=x+y;
    // 1. System.out.println("sum= "+z);
    // Scanner s=new Scanner(System.in);
    // int a=s.nextInt();
    // int b=s.nextInt();
    // System.out.println(a+b);
    return z; // 2.
    }
   }
   
//execution logic class(main class/driver code)
class first{
    public static void main(String abc[]){
        //System.out.println("hello");
       display obj= new display(); //giving memory
    //  1.  obj.show(7,8);
    //    obj.show(9, 100);

    // 2. int r1=obj.show(7,8); 
    // int r2= obj.show(9, 100);
    // System.out.println("sum 1= "+r1+ " sum 2= " +r2);

    Scanner sc = new Scanner(System.in); //system.in is input stream just lke syatem.out whoch is a n output stream
    int a=sc.nextInt();
    int b=sc.nextInt();
    obj.show(a,b);
    int r1=obj.show(a,b);
    System.out.println("sum = "+r1);
    
    }
}
//access public
//void-no return type
//static-no object req to call method
//compiler-convert high level machine to low level.. bytecode to machine lang.. therefore java is platform independent
//in place of args.. we can write any variable.. abc, hello etc anything
//void shud be written before a method
//static, public we can change sequence
//any prgm can be divided into 2 types of logic.. business logic and execution logic
//business logic-main purpose of the program.. eg-to print hello
//execution logic-req to start the execution.. it is required everywhere.. eg-main method
//classes are templates so no memory.. they are master plans
//class-idea, object-reality
//class name is a type of reference variable
//if main class is public.. file name and class name should be same
//in notepad to replace name of a file.. write.. ren file.java(old) file.java(new)
//prgm which changes its output based on demand of a user-dynamic program

