package polymorphism;

class Car extends Vehicle{
    Car (String name){
        super(name);
    }
    @Override
    public int costFuel(int km){
        return 10*km;
    }
}
