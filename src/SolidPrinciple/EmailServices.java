package SolidPrinciple;// SOLID PRINCIPLE
//5.D stands for DIP — Dependency Inversion Principle --> High-level modules should not depend on low-level modules.
// Both should depend on abstractions.
// second defination Ek class ko directly kisi specific class par dependent nahi hona chahiye;
// use interface par depend karna chahiye.
//class EmailMethod{ // that is bad approch notfollow the rule of D;
//    void send()
//    {
//        System.out.println("Send mail");
//    }
//}
//class SolidPrinciple.OrderService {
//    EmailMethod email = new EmailMethod();
//
//    void placeOrder() {
//        email.send();
//    }
//}

interface Notification {
    void send();
}

class Emailservice implements Notification {
    public void send() {
        System.out.println("Email sent");
    }
}

class SmsService implements Notification {
    public void send() {
        System.out.println("SMS sent");
    }
}
class OtpService implements Notification {
    public void send() {
        System.out.println("otp sent");
    }
}

class OrderService {
    private Notification notification;

    OrderService(Notification notification) {
        this.notification = notification;
    }

    void placeOrder() {
        notification.send();
    }
}
class SolidPrinciple5
{
    public static void main(String[] args) {
        OrderService order1 =
                new OrderService(new Emailservice()); // this way to create called constructor dependency;

        order1.placeOrder();
        SmsService sms = new SmsService();
        OrderService order2 =
                new OrderService(sms); // this way to create also called constructor dependency but that method to create
        // as instance variable of class;

        order2.placeOrder();

        OrderService order3 =
                new OrderService(new OtpService());

        order3.placeOrder();
    }
}