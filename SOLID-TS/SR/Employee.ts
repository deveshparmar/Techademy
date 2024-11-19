// Represents a Employee entity with properties and methods for managing employee data.

class Employee {
    private employeeId: string;
    private name: string;
    private departmentId: string;
    private salary: number;

    constructor(employeeId: string, name: string, departmentId: string, salary: number) {
        this.employeeId = employeeId;
        this.name = name;
        this.departmentId = departmentId;
        this.salary = salary;
    }

    getEmployeeId(): string {
        return this.employeeId;
    }

    getName(): string {
        return this.name;
    }

    getDepartmentId(): string {
        return this.departmentId;
    }

    getSalary(): number {
        return this.salary;
    }

    setSalary(salary: number): void {
        this.salary = salary;
    }
}
