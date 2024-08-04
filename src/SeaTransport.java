public class SeaTransport extends Transport{
    String motor;
    public SeaTransport(String kind, int speed, int weight, String motor){
        super(kind, speed, weight);
        this.motor = motor;
    }
    public void displaySeaTransport(){
        System.out.println(kind + " " + weight + " " + speed + " " + motor);
    }

}
