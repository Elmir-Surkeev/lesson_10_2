abstract class WaterTransport extends Transport {
    int capacity;

    WaterTransport(String make, String model, int maxSpeed, int capacity) {
        super(make, model, maxSpeed);
        this.capacity = capacity;
    }
}

