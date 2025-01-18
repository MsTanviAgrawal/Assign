public class EmployeeSalaryManagementSystem 
{
    public static void main(String[] args) 
    {
        Logger logger = new Logger();
        Payment pay = new Payment(logger);

        Employee emp1 = new Permanent_Employee("Chandragupt", 50000, 3000);
        Employee emp2 = new Contract_Employee("Chahak", 50, 500);

        pay.addEmployee(emp1);
        pay.addEmployee(emp2);

        pay.generatePayroll();
    }
}