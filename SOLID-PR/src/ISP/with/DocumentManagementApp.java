package ISP.with;

public class DocumentManagementApp {
    public static void main(String[] args) {
        PDFDocument pdfDocument = new PDFDocument();
        WordDocument wordDocument = new WordDocument();
        SpreadsheetDocument spreadsheetDocument = new SpreadsheetDocument();

        pdfDocument.read();
        pdfDocument.write();
        pdfDocument.print();
        pdfDocument.open();

        wordDocument.read();
        wordDocument.write();
        wordDocument.print();
        wordDocument.open();

        spreadsheetDocument.read();
        spreadsheetDocument.write();
        spreadsheetDocument.open();
        // spreadsheetDocument.print(); // This line will not compile as SpreadsheetDocument does not implement Printable
    }
}
