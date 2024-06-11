package ISP.with;

class WordDocument implements Readable, Writable, Printable, Openable {
    @Override
    public void read() {
        System.out.println("Reading Word document.");
    }

    @Override
    public void write() {
        System.out.println("Writing Word document.");
    }

    @Override
    public void print() {
        System.out.println("Printing Word document.");
    }

    @Override
    public void open() {
        System.out.println("Opening Word document.");
    }
}

