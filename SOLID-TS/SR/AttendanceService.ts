// The AttendanceService class manages employee attendance.

class AttendanceService {
    private attendanceRecord: Map<string, number>;

    constructor() {
        this.attendanceRecord = new Map();
    }

    markAttendance(employeeId: string): void {
        const currentAttendance = this.attendanceRecord.get(employeeId) || 0;
        this.attendanceRecord.set(employeeId, currentAttendance + 1);
        console.log(`Attendance marked for employee ID: ${employeeId}`);
    }

    getAttendance(employeeId: string): number {
        return this.attendanceRecord.get(employeeId) || 0;
    }
}
