import java.util.ArrayList;
import java.util.List;

public class Payment 
{
    private List<Employee> employees;
    private Logger logger;

    public Payment(Logger logger) {
        this.employees = new ArrayList<>();
        this.logger = logger;
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
        logger.log("Added: " + employee.getDetails());
    }
    public void generatePayroll() {
        logger.log("Generating Payment Report:");
        for (Employee employee : employees) {
            logger.log(employee.getDetails());
        }
    }
}