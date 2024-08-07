abstract class Transport {
    String make;
    String model;
    int maxSpeed;

    Transport(String make, String model, int maxSpeed) {
        this.make = make;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    abstract String move();
}