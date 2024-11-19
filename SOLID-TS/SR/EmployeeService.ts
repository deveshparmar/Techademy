// The EmployeeService class orchestrates the overall process of managing employees.

class EmployeeService {
    private attendanceService: AttendanceService;
    private payrollService: PayrollService;

    constructor(attendanceService: AttendanceService, payrollService: PayrollService) {
        this.attendanceService = attendanceService;
        this.payrollService = payrollService;
    }

    manageEmployee(employee: Employee, daysWorked: number): void {
        this.attendanceService.markAttendance(employee.getEmployeeId());
        this.payrollService.processPayroll(employee, daysWorked);
    }
}
