package polymorphism;

class Bike extends Vehicle {
    Bike (String name){
        super(name);
    }
    @Override
    public int costFuel(int km){
        return 15*km;
    }
}