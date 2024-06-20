//interface A
//interface B extends A
//interface C extends B

//DEMONSTRATE inheritance in interfaces
// Interface Vehicle
interface Vehicle {
    void type();
}

// Interface Car extending Vehicle
interface Car extends Vehicle {
    void price();
}

// Implementing class that implements the Car interface
class CarImplementation implements Car {
    @Override
    public void type() {
        System.out.println("type: 4 wheeler");
    }

    @Override
    public void price() {
        System.out.println("price: 10 lakh");
    }

    public static void main(String[] args) {
        // Create an instance of CarImplementation
        CarImplementation myCar = new CarImplementation();
        
        // Call the methods
        myCar.type();
        myCar.price();
    }
}
