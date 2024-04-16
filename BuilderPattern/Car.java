/*
 * Car Class for making car of base type ()
 * It has setters and to string method
 */

public class Car{
    private String engine;
    private int seats;
    private boolean gear;
    private boolean gps;
    private String carType;
    
    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setGear(boolean gear) {
        this.gear = gear;
    }

    public void setGPS(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", seats=" + seats + ", gear=" + gear + ", gps=" + gps + ", carType=" + carType
                + "]";
    }

   
}
