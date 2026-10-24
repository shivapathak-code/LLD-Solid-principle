package DesignPattern.BuilderDesign;
// Builder design pattern ---> in this pattern we have to learn how to
//optimise the constructor problem
// constructor problem like this suppose we have consider 4 parameter so pass easily no consfusion
// but suppose 20 parameter consider so create confusion and not easy to pass
// that is the main the problem that have to solve in that pattern that is called builder design pattern

public class Laptop {
    private String brand;
    private int ram;
    private int storage;
    private String performance;

    private Laptop(Builder builder) {
        this.brand = builder.brand;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.performance = builder.performance;
    }
    static class Builder {
        private String brand;
        private int ram;
        private int storage;
        private String performance;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }
        public Builder setPerformance(String performance) {
            this.performance = performance;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
    public void showDetails() {
        System.out.println(brand + " " + ram + "GB RAM "
                + storage + "GB Storage " + performance + " in word");
    }
}
class BuilderDesign{
    public static void main(String[] args) {
        Laptop laptop = new Laptop.Builder()
                .setBrand("HP")
                .setRam(16)
                .setStorage(512)
                .setPerformance("Good")
                .build();

        laptop.showDetails();
    }
}
