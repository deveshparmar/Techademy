package ISP.without;

public class DocumentManagementApp {
    public static void main(String[] args) {
        Document pdfDocument = new PDFDocument();
        Document wordDocument = new WordDocument();
        Document spreadsheetDocument = new SpreadsheetDocument();

        processDocument(pdfDocument);
        processDocument(wordDocument);
        processDocument(spreadsheetDocument);
    }
    public static void processDocument(Document document) {
        document.read();
        document.write();
        document.print();  // This is problematic for non-printable documents
        document.open();
    }

}
