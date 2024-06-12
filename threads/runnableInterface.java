//using runnable interface..start method isnt there

class MyThread implements Runnable{
    public void run(){
        System.out.println("runnable interface");
    }
}
public class runnableInterface {
    public static void main(String[] args) {
       MyThread t1= new MyThread(); //t1.start will give error
       Thread t2= new Thread(t1);
       t2.start();
    }
}
