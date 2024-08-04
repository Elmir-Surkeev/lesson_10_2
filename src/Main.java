//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SeaTransport lodka = new SeaTransport("sea", 190, 2000, "dizel");
        AirTransport vertalet = new AirTransport("air", 140, 2600, 8000);
        Car moped = new Car("default", 80, 100, "Electro", 2);
        Car porshe = new Car("default", 320, 1400, "Benzin", 4);
        lodka.displaySeaTransport();
        vertalet.displayAirTransport();
        moped.display();
        porshe.display();
    }
}