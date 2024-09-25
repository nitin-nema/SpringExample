package com.example.SpringExample;

interface Engine {
    void start();

}

class EngineImp implements Engine{
    @Override
    public void start(){
        System.out.println("Engine  started");
    }
}

class Car  implements  Engine{
    private EngineImp engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void setEngine(Service service){
        this.service = service;
    }

    public void startCar(){
        engine.start();
        System.out.println("Car  started");
    }
}
class Bike implements  EngineImp{
    private EngineImp engine;

    public Bike( EngineImp engine){
        this.engine = engine;
    }

    public void startBike(){
        engine.start();
        System.out.println("Bike  started");
    }
}


 class Main{
    public static void main(String[] args){
        EngineImp engine = new EngineImp();
        Car car = new Car(engine);
        //  Car car = new Car(new Engine());
        car.startCar();

    }
}