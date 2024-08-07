class Lexus extends Car {
    String luxuryFeatures;

    Lexus(String make, String model, int maxSpeed, int doors, String luxuryFeatures) {
        super(make, model, maxSpeed, doors);
        this.luxuryFeatures = luxuryFeatures;
    }

    @Override
    String move() {
        return "Едет плавно и комфортно";
    }
}
