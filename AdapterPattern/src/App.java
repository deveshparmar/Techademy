public class App {
    public static void main(String[] args) throws Exception {
        StorageDevice usb = new USB();
        Computer computer1 = new StorageDeviceAdapter(usb);
        computer1.transferData();

        StorageDevice hdd = new HDD();
        Computer computer2 = new StorageDeviceAdapter(hdd);
        computer2.transferData();
    }
}
