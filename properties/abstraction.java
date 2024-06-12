interface Sample{
    public void first(); //all methods in interface shud be public else it wont be accessed
    public void second();
}
class Display implements Sample{
    public void first(){
        System.out.println("first method implemented");
    }
    public void second(){
        System.out.println("second method implemented");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Display obj=new Display();
        obj.first();
        obj.second();
    }
}
