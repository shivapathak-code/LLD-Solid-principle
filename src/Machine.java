// SOLID PRINCIPLE
//4.I standa for Interface Segregation Principle (ISP) --> A class should not be forced to implement methods it does not need.
// or second defination Kisi class ko aise methods implement karne ke liye force nahi
// karna chahiye jinki use usse zaroorat hi nahi hai.
//public interface Machine {  // that is bad aproach that is not follow I;
//
//    void print();
//    void scan();
//    void fax();
//}
//
//class BasicPrinter implements Machine {
//
//    public void print() {
//        System.out.println("Printing...");
//    }
//
//    public void scan() {
//        throw new UnsupportedOperationException();
//    }
//
//    public void fax() {
//        throw new UnsupportedOperationException();
//    }
//}

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

interface Faxable {
    void fax();
}

class BasicPrinter implements Printable {

    public void print() {
        System.out.println("Printing...");
    }
}

class MultiFunctionPrinter
        implements Printable, Scannable, Faxable {

    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }

    public void fax() {
        System.out.println("Sending fax...");
    }
}

class SolidPrinciple4
{
    public static void main(String[] args) {

        BasicPrinter printer = new BasicPrinter();
        printer.print();

        MultiFunctionPrinter machine =
                new MultiFunctionPrinter();

        machine.print();
        machine.scan();
        machine.fax();
    }
}