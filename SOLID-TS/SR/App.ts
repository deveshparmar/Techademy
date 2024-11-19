// Create service objects
const attendanceService = new AttendanceService();
const payrollService = new PayrollService();
const employeeService = new EmployeeService(attendanceService, payrollService);

// Create departments
const coreDept = new Department("D001", "Core");
const msDept = new Department("D002", "Mindspark");

// Create employees
const employee1 = new Employee("EI-1", "Devesh", coreDept.getDepartmentId(), 3000.0);
const employee2 = new Employee("EI-2", "Virat", msDept.getDepartmentId(), 2500.0);

// Manage employees: Mark attendance and process payroll
employeeService.manageEmployee(employee1, 22);
employeeService.manageEmployee(employee2, 25);
