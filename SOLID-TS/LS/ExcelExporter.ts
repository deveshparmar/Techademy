class ExcelExporter implements DocumentExporter {
    export(data: string): void {
        if (!this.validate(data)) {
            throw new Error("Invalid data for Excel format.");
        }
        console.log("Exporting data as an Excel spreadsheet...");
        // Logic to export data as Excel
    }

    validate(data: string): boolean {
        console.log("Validating data for Excel format...");
        return /^[\w,\s]+$/.test(data); // Ensure data only contains alphanumeric characters or commas
    }
}
