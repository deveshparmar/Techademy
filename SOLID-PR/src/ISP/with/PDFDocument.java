package ISP.with;

class PDFDocument implements Readable, Writable, Printable, Openable {
    @Override
    public void read() {
        System.out.println("Reading PDF document.");
    }

    @Override
    public void write() {
        System.out.println("Writing PDF document.");
    }

    @Override
    public void print() {
        System.out.println("Printing PDF document.");
    }

    @Override
    public void open() {
        System.out.println("Opening PDF document.");
    }
}
