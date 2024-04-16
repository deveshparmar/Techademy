/*
 * CarBuilder class for building car, here the private car object is made and corresponding car configs are set to it 
 * It has setters and build method for building car object
 */

public class CarBuilder {
    private Car car;

    public CarBuilder(){
        this.car = new Car();
    }


    public CarBuilder setSeats(int seats){
        car.setSeats(seats);
        return this;
    }

    public CarBuilder setGear(boolean gear){
        car.setGear(gear);
        return this;
    }

    public CarBuilder setGPS(boolean gps){
        car.setGPS(gps);
        return this;
    }

    public CarBuilder setEngine(String engine){
        car.setEngine(engine);
        return this;
    }

    public CarBuilder setCarType(String carType) {
        car.setCarType(carType);
        return this;
    }

    public Car build(){
        return car;
    }

}