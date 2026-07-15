package polymorphism ;

public class MainTransport {

    public static void main(String[] args){
        Car car = new Car("Maruti");
        Bus bus = new Bus("Volvo");
        Bike bike = new Bike("honda");

        Vehicle[] vehicles = {car,bus,bike};

        for(Vehicle ele : vehicles){
            System.out.println(ele.name+" : "+ele.costFuel(5));
        }
        System.out.print(bus instanceof Vehicle);
    }
}
