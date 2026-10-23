// SOLID PRINCIPLE

//2 .O stands for Open/Closed Principle (OCP) --> Software entities should be open for extension but closed for modification.
//
//This means you should be able to add new functionality without repeatedly changing existing, tested code.

//public class PaymentService { // very bad approch that is not follow the O in solid principle;
//    void pay(String type) {
//        if (type.equals("UPI")) {
//            System.out.println("Pay using UPI");
//        } else if (type.equals("CARD")) {
//            System.out.println("Pay using Card");
//        }
//    }
//}
//Adding net banking or a new payment method requires modifying this class.
// so code is very lengthy and also not understandle;

// Good aproch ;

interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Pay using UPI");
    }
}

class CardPayment implements Payment {
    public void pay() {
        System.out.println("Pay using Card");
    }
}

class NetBanking implements Payment {
    public void pay() {
        System.out.println("Pay using Net Banking");
    }
}
class SolidPrinciple2
{
    public static void main(String[] args)
    {
        Payment payment1 = new CardPayment();
        payment1.pay();

        Payment payment2 = new UpiPayment();
        payment2.pay();

        Payment payment3 = new NetBanking();
        payment3.pay();
    }
}