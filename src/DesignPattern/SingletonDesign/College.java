package DesignPattern.SingletonDesign;
/// is method main object kitne baar hi banao banega sirf ek hi baar yano create ek hi baar hoga
///
///

public class College {

    // Step 1
    private static College obj;

    // Step 2
    private College() {
        System.out.println("Object created");
    }

    // Step 3
    public static College getInstance() {
        if (obj == null) {
            obj = new College();
        }

        return obj;
    }
}

class Main {
    public static void main(String[] args) {

        College c1 = College.getInstance();
        College c2 = College.getInstance();
        College c3 = College.getInstance();

        System.out.println(c1 == c2);
        System.out.println(c2 == c3);
    }
}
