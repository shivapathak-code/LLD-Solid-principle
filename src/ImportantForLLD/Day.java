package ImportantForLLD;

//when i have learning LLD from zero to advance to one concept and datatype use in various type that is called
// Enup datatype in that mean --> In Java, enum (Enumeration) is a special data type used to define a fixed set of constants. It is useful when a variable should have only a limited number of predefined values.
//
//For example: days of the week, payment status, order status, traffic lights, etc.

public enum Day {
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class Main {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        System.out.println(today);
    }
}
