package ImportantForLLD;

public enum PaymentStatus {
    PENDING, SUCCESS, FAILED
}

class Main1 {
    public static void main(String[] args) {
        PaymentStatus status = PaymentStatus.SUCCESS;

        System.out.println(status);
    }
}
