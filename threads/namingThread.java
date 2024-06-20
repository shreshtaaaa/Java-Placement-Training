class Thread1 extends Thread{
    public void run(){
        System.out.println("1st thread started running");
    }
}
class Thread2 extends Thread{
    public void run(){
        System.out.println("2nd thread started running");
    }
}
public class namingThread {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
        System.out.println("1st thread name:"+t1.getName());
        System.out.println("2nd thread name:"+t2.getName());
        //changinf names of threads
        t1.setName("First Thread");
        t2.setName("Second Thread");

        System.out.println("1st thread name:"+t1.getName());
        System.out.println("2nd thread name:"+t2.getName());
    }
}
