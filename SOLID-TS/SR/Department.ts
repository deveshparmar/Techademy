// The Department class is used to manage department-related information.

class Department {
    private departmentId: string;
    private departmentName: string;

    constructor(departmentId: string, departmentName: string) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    getDepartmentId(): string {
        return this.departmentId;
    }

    getDepartmentName(): string {
        return this.departmentName;
    }
}
