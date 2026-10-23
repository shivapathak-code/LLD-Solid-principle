//SOLID PRINCIPLE
// 3.L stands for Liskov Substitution Principle (LSP) --> An object of a child class should be usable wherever its parent type is expected,
// without breaking the program's expected behavior.
//public class Bird { // Bad aproch beacuse penguin is not fly so use good principle that is L;
//    void fly() {}
//}
//
//class Sparrow extends Bird {
//    @Override
//    void fly() {
//        System.out.println("Sparrow flies");
//    }
//}
//
//class Penguin extends Bird {
//    @Override
//    void fly() {
//        throw new UnsupportedOperationException();
//    }
//}

//LSP = Child class ko parent ki jagah use karne par program ka expected behavior nahi tootna chahiye.
//class Bird {
//    void eat() {
//        System.out.println("Bird eats");
//    }
//}
//
//interface Flyable {
//    void fly();
//}
//
//class Sparrow extends Bird implements Flyable {
//    public void fly() {
//        System.out.println("Sparrow flies");
//    }
//}
//
//class Penguin extends Bird {
//    // Penguin does not implement Flyable
//}
//
//class SolidPrinciple3
//{
//    public static void main(String[] args) {
//        Bird b1 = new Sparrow();
//        b1.eat();
//
//        Flyable f1 = new Sparrow();
//        f1.fly();
//
//        Bird b2 = new Penguin();
//        b2.eat();
//    }
//}

//Another example
//class Vehicle { // that is not better approch beacuse that is not follow L;
//    void startEngine() {
//        System.out.println("Engine started");
//    }
//}
//
//class Car extends Vehicle {
//    @Override
//    void startEngine() {
//        System.out.println("Car engine started");
//    }
//}
//
//class Bicycle extends Vehicle {
//    @Override
//    void startEngine() {
//        throw new UnsupportedOperationException(
//                "Bicycle has no engine"
//        );
//    }
//}

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

interface EnginePowered {
    void startEngine();
}

class Car extends Vehicle implements EnginePowered {
    public void startEngine() {
        System.out.println("Car engine started");
    }
}

class Bicycle extends Vehicle {
    // A bicycle can move without an engine
}

class SolidPrinciple3 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.move();

        Vehicle v2 = new Bicycle();
        v2.move();

        EnginePowered car = new Car();
        car.startEngine();
    }
}