class WordExporter implements DocumentExporter {
    export(data: string): void {
        if (!this.validate(data)) {
            throw new Error("Invalid data for Word format.");
        }
        console.log("Exporting data as a Word document...");
        // Logic to export data as Word
    }

    validate(data: string): boolean {
        console.log("Validating data for Word format...");
        return data.trim().length > 0; // Ensure no leading/trailing whitespace
    }
}
