
class Bicycle extends LandTransport {
    int gears;

    Bicycle(String make, String model, int maxSpeed, int gears) {
        super(make, model, maxSpeed, 2);
        this.gears = gears;
    }

    @Override
    String move() {
        return "Едет на педалях";
    }
}
