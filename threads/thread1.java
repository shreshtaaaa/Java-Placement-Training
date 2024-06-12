//using thread class
class test extends Thread{
    public void run(){
        System.out.println("thread1 started running");
    }
}
class test2 extends Thread{
    public void run(){
        System.out.println("thread2 started running");
    }
}
class thread1{
    public static void main(String[] args) {
        test t1=new test();
        test2 t2=new test2();
        t1.start();
        t2.start();
    }
}
//in runnable interface.. start method is not there