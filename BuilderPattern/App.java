/*
 * Driver code for building car with help of car builder and setting up the functionalities to car
 */

public class App {
    public static void main(String[] args) throws Exception {
        // creating car object and setting fields explicitely
        Car car = new CarBuilder()
                .setSeats(4)
                .setCarType("Sedan")
                .setGPS(false)
                .setGear(true)
                .setEngine("1000cc")
                .build();

        System.out.println(car);

        // vreating car object with minimal fields
        Car car2 = new CarBuilder()
                .setCarType("Sedan")
                .setEngine("1000cc")
                .build();

        System.out.println(car2);
    }
}
