package ImportantForLLD;

public enum Status {
    SUCCESS(200),
    NOT_FOUND(404),
    SERVER_ERROR(500);

    private final int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

class Main3 {
    public static void main(String[] args) {
        System.out.println(Status.SUCCESS.getCode());
        System.out.println(Status.NOT_FOUND.getCode());
    }
}
