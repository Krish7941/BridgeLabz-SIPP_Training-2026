package polymorphism;

class Bus extends Vehicle {
    Bus (String name){
        super(name);
    }
    @Override
    public int costFuel(int km){
        return 15*km;
    }
}
