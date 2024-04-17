public class StorageDeviceAdapter implements Computer{
    private StorageDevice storageDevice;
    public StorageDeviceAdapter(StorageDevice storageDevice){
        this.storageDevice = storageDevice;
    }
    @Override
    public void transferData(){
        storageDevice.readData();
        System.out.println("Transferring data to computer");
    }
}