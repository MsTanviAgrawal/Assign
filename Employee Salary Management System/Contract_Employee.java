public class Contract_Employee implements Employee 
{
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Contract_Employee(String name, double hourlyRate, int hoursWorked) 
    {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    @Override
    public String getDetails() {
        return "Contract Employee: " + name + ", Salary: " + calculateSalary();
    }
}