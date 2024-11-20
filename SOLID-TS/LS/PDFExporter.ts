class PDFExporter implements DocumentExporter {
    export(data: string): void {
        if (!this.validate(data)) {
            throw new Error("Invalid data for PDF format.");
        }
        console.log("Exporting data as a PDF...");
        // Logic to export data as PDF
    }

    validate(data: string): boolean {
        console.log("Validating data for PDF format...");
        return data.length > 0; // Basic validation for PDF format
    }
}
