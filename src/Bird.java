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

class Bird {
    void eat() {
        System.out.println("Bird eats");
    }
}

interface Flyable {
    void fly();
}

class Sparrow extends Bird implements Flyable {
    public void fly() {
        System.out.println("Sparrow flies");
    }
}

class Penguin extends Bird {
    // Penguin does not implement Flyable
}

class SolidPrinciple3
{
    public static void main(String[] args) {
        Bird b1 = new Sparrow();
        b1.eat();

        Flyable f1 = new Sparrow();
        f1.fly();

        Bird b2 = new Penguin();
        b2.eat();
    }
}