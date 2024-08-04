public class Car extends EarthTransport{
    int countWheels;
    public Car(String kind, int speed, int weight, String motor, int countWheels){
        super(kind, speed, weight, motor);
        this.countWheels = countWheels;
    }
    public void display(){
        System.out.println("вид транспорта " + kind +
                " скорость: +" + speed +
                " вес : "+ weight
                + " вид мотора " + motor
                + " количество колес "+ countWheels );
    }
}
