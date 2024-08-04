public class EarthTransport extends SeaTransport{
    String kind = "земные";
    public EarthTransport(String kind, int speed, int weight, String motor){
        super(kind, speed, weight, motor);
    }
}
