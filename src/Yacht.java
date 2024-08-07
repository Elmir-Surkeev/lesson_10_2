class Yacht extends WaterTransport {
    String luxuryFeatures;

    Yacht(String make, String model, int maxSpeed, int capacity, String luxuryFeatures) {
        super(make, model, maxSpeed, capacity);
        this.luxuryFeatures = luxuryFeatures;
    }

    @Override
    String move() {
        return "Плывет роскошно по воде";
    }
}