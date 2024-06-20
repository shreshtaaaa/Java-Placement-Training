//inter thread communication

class Thread1 extends Thread{
    public void run(){
        Thread t2=new Thread2();
        t2.start();
        
        try
        {t2.sleep(15000);
        }
        catch(Exception e){}
        System.out.println("thread2: "+t2.getState());
    }
}
class Thread2 extends Thread{
    public void run()
    {
        Thread t3=new Thread3();
        t3.start();
        
        try
        {t3.sleep(10000);}
        catch(Exception e){}
        System.out.println("thread3: "+t3.getState());
    }
}
class Thread3 extends Thread{

}

public class itc {
    public static void main(String[] args)throws Exception {
        Thread1 t1=new Thread1();
        t1.start();
        t1.sleep(2000);
        System.out.println("thread1: "+t1.getState());
        
    }
}
