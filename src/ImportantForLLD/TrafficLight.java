package ImportantForLLD;

public enum TrafficLight {
    RED, YELLOW, GREEN
}

 class Main2 {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;

        switch (light) {
            case RED:
                System.out.println("Stop");
                break;

            case YELLOW:
                System.out.println("Wait");
                break;

            case GREEN:
                System.out.println("Go");
                break;
        }
    }
}
