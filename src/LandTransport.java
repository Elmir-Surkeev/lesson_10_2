
abstract class LandTransport extends Transport {
    int wheels;

    LandTransport(String make, String model, int maxSpeed, int wheels) {
        super(make, model, maxSpeed);
        this.wheels = wheels;
    }
}