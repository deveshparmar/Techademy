// Base interface for document exporters

interface DocumentExporter {
    export(data: string): void; // Export the document in a specific format
    validate(data: string): boolean; // Validate the document's structure for the format
}