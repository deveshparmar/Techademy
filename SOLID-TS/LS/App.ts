// Create instances of exporters
const pdfExporter = new PDFExporter();
const wordExporter = new WordExporter();
const excelExporter = new ExcelExporter();

// Test exporting with PDF
const pdfManager = new DocumentManager(pdfExporter);
pdfManager.exportDocument("This is a PDF document.");

// Test exporting with Word
const wordManager = new DocumentManager(wordExporter);
wordManager.exportDocument(" This is a Word document. "); // Includes leading/trailing whitespace

// Test exporting with Excel
const excelManager = new DocumentManager(excelExporter);
excelManager.exportDocument("Row1,Row2,Row3");
