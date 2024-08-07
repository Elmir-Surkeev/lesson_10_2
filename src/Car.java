
class Car extends LandTransport {
    int doors;

    Car(String make, String model, int maxSpeed, int doors) {
        super(make, model, maxSpeed, 4);
        this.doors = doors;
    }

    @Override
    String move() {
        return "Едет на бензине";
    }
}