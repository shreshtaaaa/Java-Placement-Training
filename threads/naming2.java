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
public class naming2 {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread t3=new Thread(t1,"first_thread");
        Thread t4= new Thread(t2,"second_thread");
        t3.start();
        t4.start();
        System.out.println("1st thread name:"+t1.getName());
        System.out.println("2nd thread name:"+t2.getName());
        //changinf names of threads
        t1.setName("First Thread");
        t2.setName("Second Thread");

        System.out.println("1st thread name:"+t1.getName());
        System.out.println("2nd thread name:"+t2.getName());
    }
}
