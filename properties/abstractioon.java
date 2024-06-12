//methods with no body/no implementation
//in abstract class not necessary to write abstract method
//but whenever we write abstract method it should be in class
//abstract class-can be instantiated
//abstract methods
//interfaces-cannot be instantiated
//-----
//classes-guidelines
//interfaces-rules
//-----
//class may be partially abstract (all methods inside a claass may not be abstract methds)
//interface is a fully abstract (when a class implements interface it shud be fully abstract)
abstract class Student{
    void display(){
        System.out.println("first method of abstract class");
    }
    abstract void present();
}
class First extends Student{
    void present(){
        System.out.println("abstract method implemented");
    }
}
public class abstractioon {
    public static void main(String[] args) {
        First obj=new First();
        obj.display();
        obj.present();
    }
}
