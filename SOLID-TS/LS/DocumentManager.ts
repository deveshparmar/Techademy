// interacts only with the base DocumentExporter interface, ensuring flexibility.
class DocumentManager {
    private exporter: DocumentExporter;

    constructor(exporter: DocumentExporter) {
        this.exporter = exporter;
    }

    exportDocument(data: string): void {
        try {
            console.log("Starting document export...");
            this.exporter.export(data);
            console.log("Document export completed successfully.");
        } catch (error) {
            console.error(`Export failed: ${(error as Error).message}`);
        }
    }
}
