public class AirTransport extends Transport{
    int flyHeight;
    public AirTransport(String kind, int speed, int weight, int flyHeight){
        super(kind, speed, weight);
        this.flyHeight = flyHeight;
    }
    public void displayAirTransport(){
        System.out.println(kind + " " + speed + " " + weight + " " + flyHeight);
    }
}
