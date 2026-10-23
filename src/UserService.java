// SOLID PRINCIPLE;

// FIRST SOLID PRINCIPLE;
// 1.S stands for Single Responsibility Principle (SRP) ---> A class should have only one reason to change.
// In simple words, one class should have one main responsibility

//public class UserService {  // That is bad aproch because that is not follow the rule of S ---> in solid principle
//    void registerUser() {
//        // Save user to database
//    }
//
//    void sendEmail() {
//        // Send welcome email
//    }
//
//    void generateReport() {
//        // Generate user report
//    }
//}

public class UserService{
    EmailService emailService = new EmailService();
    ReportService reportService = new ReportService();
    void registerUser()
    {
        // register a user
        System.out.println("User register successfully");
        emailService.sendEmail();
        reportService.generateReport();

    }
}
class EmailService {
    void sendEmail() {
        // Send email
        System.out.println("Send mail in your gmail");
    }
}
class ReportService {
    void generateReport() {
        // Generate report
        System.out.println("Generate a report");
    }
}
class Solidprinciple1
{
    public static void main(String[] args)
    {
        UserService userService = new UserService();
        userService.registerUser();
    }
}

