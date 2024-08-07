class Train extends LandTransport {
    int carriages;

    Train(String make, String model, int maxSpeed, int carriages) {
        super(make, model, maxSpeed, 8);
        this.carriages = carriages;
    }

    @Override
    String move() {
        return "Едет по рельсам";
    }
}