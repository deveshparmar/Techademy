// The PayrollService class handles salary calculations and payroll processing.

class PayrollService {
    calculateSalary(employee: Employee, daysWorked: number): number {
        // Assuming salary is calculated based on the number of days worked
        const dailyWage = employee.getSalary() / 30;  // Assuming 30 days in a month
        return dailyWage * daysWorked;
    }

    processPayroll(employee: Employee, daysWorked: number): void {
        const salary = this.calculateSalary(employee, daysWorked);
        console.log(`Processing payroll for ${employee.getName()}: $${salary.toFixed(2)}`);
    }
}
