package ISP.with;

class SpreadsheetDocument implements Readable, Writable, Openable {
    @Override
    public void read() {
        System.out.println("Reading Spreadsheet document.");
    }

    @Override
    public void write() {
        System.out.println("Writing Spreadsheet document.");
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet document.");
    }
}

