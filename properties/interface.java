//interface A
//interface B extends A
//interface C extends B

//DEMONSTRATE inheritance in interfaces
interface Vehicle{
    public void type();
}
interface Car extends Vehicle{
    public void price();
    }
    
class interface implements Car{
    public void type(){
        System.out.println("type:4 wheeler");
    }
    public void price(){
        System.out.println("price: 10 lakh");
    }
