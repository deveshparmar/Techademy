package ISP.without;

public class SpreadsheetDocument implements Document{
    @Override
    public void read() {
        System.out.println("Reading Spreadsheet document.");
    }

    @Override
    public void write() {
        System.out.println("Writing Spreadsheet document.");
    }

    @Override
    public void print() {
       throw new Error("Spreadsheet is not printable");
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet document.");
    }
}
